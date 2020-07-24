package grammar;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DirectedPseudograph;
import org.json.simple.JSONObject;

public class GrammarExtractor {

  // Type graph of the CUT
  private static Graph<String, LabeledEdge> type_graph;
  private static int bound = 3;
  private static String GRAMMARS_DIR = System.getProperty("user.dir") + "/grammars/";

  public static void main(String[] args) throws ClassNotFoundException {

    if (args.length != 1) {
      System.out.println("Only the fully quallified name of the CUT is expected");
    }

    // Get the class
    String qualified_name = args[0];

    Class<?> cut = Class.forName(qualified_name);

    System.out.println("Analyzing class: " + cut.getName());
    System.out.println();

    // Build the corresponding type graph
    System.out.println("Building the Type Graph");
    type_graph = new DirectedPseudograph<String, LabeledEdge>(LabeledEdge.class);
    build_type_graph(cut, new HashSet<String>());
    System.out.println("Nodes: " + type_graph.vertexSet().toString());
    System.out.println("Edges: " + type_graph.edgeSet().toString());
    System.out.println();

    // Extract the Grammar
    System.out.println("Generating the Grammar from the Type Graph");
    extract_grammar(cut);
    System.out.println();
    System.out.println("Done!");
  }

  /**
   * Build the type graph from the given starting type
   */
  private static void build_type_graph(Class<?> cut, Set<String> visited) {
    if (visited.add(cut.getName())) {
      type_graph.addVertex(cut.getSimpleName());
      // Get the fields of the given type
      Set<Class<?>> to_visit = new HashSet<Class<?>>();
      List<Field> fields = getAllFields(new LinkedList<Field>(), cut);
      for (Field fld : fields) {
        if (!Modifier.isStatic(fld.getModifiers())) {
          // For each non static field
          String fld_decl_name = fld.getName();
          Class<?> fld_type = fld.getType();
          type_graph.addVertex(fld_type.getSimpleName());
          type_graph.addEdge(cut.getSimpleName(), fld_type.getSimpleName(),
              new LabeledEdge(fld_decl_name));

          to_visit.add(fld_type);
        }
      }
      for (Class<?> cls : to_visit) {
        // Visit only non-primitive types for now
        if (!cls.isPrimitive())
          build_type_graph(cls, visited);
      }
    }
  }

  /**
   * Get all fields from CUT (even the inherited ones)
   */
  private static List<Field> getAllFields(List<Field> fields, Class<?> cut) {
    fields.addAll(Arrays.asList(cut.getDeclaredFields()));

    if (cut.getSuperclass() != null) {
      getAllFields(fields, cut.getSuperclass());
    }

    return fields;
  }

  /**
   * Create the quantification related symbols from label
   */
  private static void add_quantification_symbols_from_label(Map<String, List<String>> grammar,
      String type_name, String curr_expr, String label) {
    GrammarBuilder.add_quantification_symbols(grammar, type_name, curr_expr, label);
    Set<LabeledEdge> edges = type_graph.outgoingEdgesOf(type_name);
    for (LabeledEdge edge : edges) {
      String target_type = type_graph.getEdgeTarget(edge);
      if (!type_name.equals(target_type)) {
        String dest_label = edge.getLabel();
        GrammarBuilder.add_quantification_over_field_symbols(grammar, type_name, curr_expr,
            target_type, label, dest_label);
      }
    }

  }

  /**
   * Add the the given current expression as a symbol for the corresponding type
   */
  private static void add_symbol_for_type(String type_name, String curr_expr,
      Map<String, List<String>> grammar) {
    String type_symbol = GrammarBuilder.get_symbol_for_type(type_name);
    GrammarBuilder.extend_grammar(grammar, type_symbol, curr_expr);
  }

  /**
   * Traverse the type graph from the given type and extend the given grammar
   */
  private static void traverse_graph(String type_name, String curr_expr,
      Map<String, List<String>> grammar, int k) {
    if (k > 0) {
      Set<LabeledEdge> edges = type_graph.outgoingEdgesOf(type_name);
      for (LabeledEdge edge : edges) {
        String target_type = type_graph.getEdgeTarget(edge);
        if (type_name.equals(target_type)) {
          // We have a closure case, so create the quantificaiton related symbols
          add_quantification_symbols_from_label(grammar, type_name, curr_expr, edge.getLabel());
        } else {
          // This is not a closure case, continue exploring only reference types
          if (TypesUtil.is_reference(target_type)) {
            traverse_graph(target_type, curr_expr + "." + edge.getLabel(), grammar, k - 1);
          } else {
            add_symbol_for_type(target_type, curr_expr + "." + edge.getLabel(), grammar);
          }
        }
      }
    }

  }

  /**
   * Save the given JSONObject Grammar to a file using the given name
   */
  private static void save_to_file(JSONObject json_grammar, String file_name) {
    System.out.println("Saving grammar to file:" + GRAMMARS_DIR + file_name);
    try (FileWriter file = new FileWriter(GRAMMARS_DIR + file_name)) {
      file.write(json_grammar.toJSONString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Extract the grammar from the obtained type graph
   */
  private static void extract_grammar(Class<?> cut) {
    System.out.println("Extracting grammar from initial type: " + cut.getName());
    Map<String, List<String>> grammar = GrammarBuilder.create();
    traverse_graph(cut.getSimpleName(), cut.getSimpleName(), grammar, bound);
    System.out.println();
    JSONObject json_grammar = new JSONObject(grammar);
    System.out.println(json_grammar.toJSONString());
    System.out.println();
    save_to_file(json_grammar, cut.getSimpleName() + "Grammar.json");
  }

}
