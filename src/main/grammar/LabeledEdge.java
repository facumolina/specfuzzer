package grammar;

import org.jgrapht.graph.DefaultEdge;

/**
 * Represents a Labeled Edge in a Graph
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class LabeledEdge extends DefaultEdge {

  private static final long serialVersionUID = 1L;

  private String label;

  /**
   * Constructs a labeled edge
   *
   * @param label
   *          the label of the new edge.
   * 
   */
  public LabeledEdge(String label) {
    this.label = label;
  }

  /**
   * Gets the label associated with this edge.
   *
   * @return edge label
   */
  public String getLabel() {
    return label;
  }

  @Override
  public String toString() {
    return "(" + getSource() + " : " + getTarget() + " : " + label + ")";
  }

}