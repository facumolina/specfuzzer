package grammar;

import org.jgrapht.graph.DirectedPseudograph;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * This class contains tests to ensure that the GrammarExctractor is extracting grammars without unexpected errors.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class GrammarExtractorTest {

  @Test
  public void regionGrammarTest() throws ClassNotFoundException, NoSuchFieldException {
    // Initialize
    Class<?> cut = Class.forName("DataStructures.sf110.Region");
    GrammarExtractor.type_graph = new DirectedPseudograph<Class<?>, LabeledEdge>(LabeledEdge.class);
    GrammarExtractor.build_type_graph(cut, new HashSet<String>());
    // Grammar extraction steps
    Map<String, List<String>> grammar = GrammarBuilder.create(cut);
    GrammarExtractor.traverse_graph(cut, cut.getSimpleName(), grammar, GrammarExtractor.bound);
    GrammarBuilder.remove_non_expandable(grammar);
    // Assertions about the obtained grammar
    assert(grammar.get(GrammarSymbols.INTEGER_FIELD).size()==4);
  }

}
