package grammar;

import grammar.symbols.IntegerSymbols;
import org.jgrapht.graph.DirectedPseudograph;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * This class contains tests to ensure that the GrammarExtractor is extracting grammars without unexpected errors.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class GrammarExtractorTest {

  @Before
  public void setupGrammarExtractor() {
    GrammarExtractor.type_graph = new DirectedPseudograph<>(LabeledEdge.class);
  }

  @Test
  public void regionGrammarTest() throws ClassNotFoundException, NoSuchFieldException {
    // Initialize
    Class<?> cut = Class.forName("DataStructures.sf110.Region");
    GrammarExtractor.build_type_graph(cut, new HashSet<String>());
    // Grammar extraction steps
    Map<String, List<String>> grammar = GrammarBuilder.create(cut);
    GrammarExtractor.traverse_graph(cut, cut.getSimpleName(), grammar, GrammarExtractor.bound);
    GrammarBuilder.remove_non_expandable(grammar);
    // Assertions about the obtained grammar
    assert(grammar.get(IntegerSymbols.INTEGER_FIELD).size()==4);
  }

  @Test
  public void listGrammarTest() throws ClassNotFoundException, NoSuchFieldException{
    // Initialize
    Class<?> cut = Class.forName("DataStructures.List");
    GrammarExtractor.build_type_graph(cut, new HashSet<String>());
    // Grammar extraction steps
    Map<String, List<String>> grammar = GrammarBuilder.create(cut);
    GrammarExtractor.traverse_graph(cut, cut.getSimpleName(), grammar, GrammarExtractor.bound);
    GrammarBuilder.remove_non_expandable(grammar);
    // Assertions about the obtained grammar
    assert(grammar.get(IntegerSymbols.INTEGER_FIELD).size()==1);
  }

  @Test
  public void staticClassGrammarTest() throws ClassNotFoundException, NoSuchFieldException{
    // Initialize
    Class<?> cut = Class.forName("gassert.SimpleMethods");
    GrammarExtractor.build_type_graph(cut, new HashSet<String>());
    // Grammar extraction steps
    Map<String, List<String>> grammar = GrammarBuilder.create(cut);
    GrammarExtractor.traverse_graph(cut, cut.getSimpleName(), grammar, GrammarExtractor.bound);
    GrammarBuilder.remove_non_expandable(grammar);
    // Assertions about the obtained grammar
    assert(grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).size()>0);
  }

}