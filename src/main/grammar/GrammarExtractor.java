package grammar;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import grammar.symbols.ConstantSymbols;
import org.jgrapht.Graph;
import org.jgrapht.graph.DirectedPseudograph;
import utils.JavaTypesUtil;

public class GrammarExtractor {

  // Type graph of the CUT
  protected static Graph<Class<?>, LabeledEdge> type_graph;
  protected static int bound = 3;
  private static String GRAMMARS_DIR = System.getProperty("user.dir") + "/grammars/";

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, SecurityException {

    if (args.length > 2) {
      System.out.println("Only the fully qualified name of the CUT is expected and the grammar output dir.");
    }

    // Get the class and the grammar output dir if provided
    String qualified_name = args[0];
    if (args.length==2)
      GRAMMARS_DIR = args[1];

    Class<?> cut = Class.forName(qualified_name);

    System.out.println("> Analyzing class: " + cut.getName());
    System.out.println();

    // Build the corresponding type graph
    System.out.println("> Building the Type Graph");
    type_graph = new DirectedPseudograph<Class<?>, LabeledEdge>(LabeledEdge.class);
    build_type_graph(cut, new HashSet<>());
    System.out.println("Nodes: " + type_graph.vertexSet().toString());
    System.out.println("Edges: " + type_graph.edgeSet().toString());
    System.out.println();

    // Extract the Grammar
    System.out.println("> Generating the Grammar from the Type Graph");
    extract_grammar(cut);
    System.out.println();
    System.out.println("> Done!");
  }

  /**
   * Build the type graph from the given starting type
   */
  protected static void build_type_graph(Class<?> cut, Set<String> visited) {
    if (visited.add(cut.getName())) {
      if (!cut.getName().contains("java.util") && !java.lang.Error.class.isAssignableFrom(cut)) {
        // Only visit the fields of non java util classes
        // and that are not instances of java.lang.Error
        type_graph.addVertex(cut);
        // Get the fields of the given type
        Set<Class<?>> to_visit = new HashSet<Class<?>>();
        List<Field> fields = getAllFields(new LinkedList<Field>(), cut);
        for (Field fld : fields) {
          if (!Modifier.isStatic(fld.getModifiers())) {
            // For each non static field
            String fld_decl_name = fld.getName();
            Class<?> fld_type = fld.getType();
            type_graph.addVertex(fld_type);
            type_graph.addEdge(cut, fld_type, new LabeledEdge(fld_decl_name));

            to_visit.add(fld_type);
          }
        }
        for (Class<?> cls : to_visit) {
          // Visit fields only for non-primitive types for now
          if (!cls.isPrimitive())
            build_type_graph(cls, visited);
        }
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
   * Create the membership related symbols from label
   */
  private static void add_membership_symbols(Map<String, List<String>> grammar, Class<?> cut,
    String curr_expr, String label) {
      // The base set can be built: curr_expr.*(label)
      // TODO
      // For each field that can be applied after label, i.e., starting from curr_expr.label type
      // Create the corresponding set with he corresponding type
    Set<LabeledEdge> edges = type_graph.outgoingEdgesOf(cut);
    for (LabeledEdge edge : edges) {
      Class<?> target_type = type_graph.getEdgeTarget(edge);
      if (!cut.equals(target_type)) {
        String dest_label = edge.getLabel();
        String final_type = JavaTypesUtil.format_type(target_type.getSimpleName());
        if (!JavaTypesUtil.is_reference(target_type.getSimpleName()))
          GrammarBuilder.add_membership_symbol(grammar, cut.getSimpleName(), curr_expr, dest_label, final_type);
      }
    }
  }

  /**
   * Create the quantification related symbols from label
   */
  private static void add_quantification_symbols_from_label(Map<String, List<String>> grammar,
      Class<?> cut, String curr_expr, String label) {
    GrammarBuilder.add_quantification_symbols(grammar, cut.getSimpleName(), curr_expr, label);
    Set<LabeledEdge> edges = type_graph.outgoingEdgesOf(cut);
    for (LabeledEdge edge : edges) {
      Class<?> target_type = type_graph.getEdgeTarget(edge);
      if (!cut.equals(target_type)) {
        String dest_label = edge.getLabel();
        GrammarBuilder.add_quantification_over_field_symbols(grammar, cut.getSimpleName(),
            curr_expr, target_type.getSimpleName(), label, dest_label);
      }
    }
  }

  /**
   * Create the special quantification related symbols from label that leads to a Collection
   * 
   * @throws SecurityException
   * @throws NoSuchFieldException
   * @throws ClassNotFoundException
   */
  private static void add_special_quantification_symbols(Map<String, List<String>> grammar,
      Class<?> cut, String curr_expr, String label)
      throws NoSuchFieldException, SecurityException {
    Field f = cut.getDeclaredField(label);
    Type type = f.getGenericType();
    Class<?> c = JavaTypesUtil.get_parameterized_class(type);
    if (c!=null)
      GrammarBuilder.add_special_quantification_symbols(grammar, c.getSimpleName(),
            curr_expr + "." + label);
  }

  /**
   * Create the special quantification related symbols from label that leads to a Collection
   */
  private static void add_special_quantification_symbols_from_map(Map<String, List<String>> grammar,
      Class<?> cut, String curr_expr, String label)
      throws NoSuchFieldException, SecurityException {
    Field f = cut.getDeclaredField(label);
    Type type = f.getGenericType();
    if (type instanceof ParameterizedType) {
      ParameterizedType pt = (ParameterizedType) type;

      Type[] types = pt.getActualTypeArguments();
      assert (types.length == 2);
      String collection_type_one = "";
      String collection_type_two = "";
      try {
        // First type is the one related to the data and the second type is the one related to the
        // value
        collection_type_one = types[0].getTypeName();
        collection_type_two = types[1].getTypeName();

        Class<?> collection_class = Class.forName(collection_type_one);
        collection_type_one = collection_class.getSimpleName();

        collection_class = Class.forName(collection_type_two);
        collection_type_two = collection_class.getSimpleName();
      } catch (ClassNotFoundException e) {
      }
      GrammarBuilder.add_special_quantification_symbols(grammar, collection_type_one,
              curr_expr + "." + label + "." + ConstantSymbols.MAP_KEY_SET);
      GrammarBuilder.add_special_quantification_symbols(grammar, collection_type_two,
              curr_expr + "." + label + "." + ConstantSymbols.MAP_VALUES);
    } else {
      System.out.println("Can't add special quantification symbol from map for field type: "+type.getTypeName());
      System.out.println("Label: "+label);
      System.out.println("Current expr: "+curr_expr);
    }
  }

  /**
   * Add the the given current expression as a symbol for the corresponding type
   */
  private static void add_symbol_for_type(String type_name, String curr_expr,
      Map<String, List<String>> grammar) {
    String type_symbol = GrammarSymbols.get_symbol_for_type(type_name);
    GrammarBuilder.add_field_type(type_name);
    if (!type_symbol.equals("<"+JavaTypesUtil.INTEGER+"_Field>")) {
      GrammarBuilder.extend_grammar(grammar, type_symbol, curr_expr);
    }
  }

  /**
   * Traverse the type graph from the given type and extend the given grammar
   * 
   * @throws SecurityException when there is no permission to access cut component.
   * @throws NoSuchFieldException when there is a field of the cut that can't be accessed.
   * @throws ClassNotFoundException when there is a class referenced by the cut that can't be loaded.
   */
  protected static void traverse_graph(Class<?> cut, String curr_expr,
      Map<String, List<String>> grammar, int k)
      throws NoSuchFieldException, SecurityException, ClassNotFoundException {
    if (k > 0) {
      Set<LabeledEdge> edges = type_graph.outgoingEdgesOf(cut);
      for (LabeledEdge edge : edges) {
        Class<?> target_type = type_graph.getEdgeTarget(edge);
        if (cut.equals(target_type)) {
          // We have a closure case, so create the quantification related symbols
          add_quantification_symbols_from_label(grammar, cut, curr_expr, edge.getLabel());
          add_membership_symbols(grammar, cut, curr_expr, edge.getLabel());
        } else {
          // This is not a closure case, continue exploring only non primitive types
          if (!target_type.isPrimitive()) {
            if (java.util.Map.class.isAssignableFrom(target_type)) {
              // The target type is a map, so we can create quantification symbol for
              // the keys and values sets
              add_special_quantification_symbols_from_map(grammar, cut, curr_expr, edge.getLabel());
            } else if (java.util.Collection.class.isAssignableFrom(target_type)) {
              // The target type is a collection so we can create a quantification symbol
              add_special_quantification_symbols(grammar, cut, curr_expr, edge.getLabel());
            } else if (target_type.isArray()) {
              // The target type is an array, so also use it as it were a collection
              add_special_quantification_symbols(grammar, cut, curr_expr, edge.getLabel());
            }
            traverse_graph(target_type, curr_expr + "." + edge.getLabel(), grammar, k - 1);
          } else {
            add_symbol_for_type(target_type.getSimpleName(), curr_expr + "." + edge.getLabel(),
                grammar);
          }
        }
      }
    }
  }

  /**
   * Save the given JSONObject Grammar to a file using the given name
   */
  private static void save_to_file(String json_grammar, String file_name) {
    System.out.println("Saving grammar to file: " + GRAMMARS_DIR + file_name);
    try (FileWriter file = new FileWriter(GRAMMARS_DIR + file_name)) {
      file.write(json_grammar);
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Show a report with some useful numbers
   */
  private static void show_report(Map<String, List<String>> grammar) {
    int rules = grammar.size();
    int potential_specs = GrammarBuilder.calculate_potential_specs(grammar);
    System.out.println("Grammar numbers");
    System.out.println("Rules: "+rules);
    System.out.println("Potential specs: "+potential_specs);
    System.out.println();
  }


  /**
   * Extract the grammar from the obtained type graph
   *
   * @throws SecurityException when there is no permission to access cut component.
   * @throws NoSuchFieldException when there is a field of the cut that can't be accessed.
   * @throws ClassNotFoundException when there is a class referenced by the cut that can't be loaded.
   */
  private static void extract_grammar(Class<?> cut)
      throws NoSuchFieldException, SecurityException, ClassNotFoundException {
    System.out.println("Extracting grammar from initial type: " + cut.getName());
    Map<String, List<String>> grammar = GrammarBuilder.create(cut);
    traverse_graph(cut, cut.getSimpleName(), grammar, bound);
    GrammarBuilder.remove_non_expandable(grammar);
    System.out.println();
    String json_grammar = get_as_json_string(new TreeMap<>(grammar));
    System.out.println(json_grammar);
    System.out.println();
    show_report(grammar);
    save_to_file(json_grammar, cut.getSimpleName() + "Grammar.json");
  }

  /**
   * Get the grammar as a JSON string
   */
  private static String get_as_json_string(Map<String, List<String>> grammar) {
    Gson gson = new GsonBuilder().create();
    return gson.toJson(grammar);
  }

}
