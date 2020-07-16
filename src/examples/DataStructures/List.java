package DataStructures;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class List implements Serializable {

  static final long serialVersionUID = 20200617L;

  private int x;
  private List next;

  private static final int SENTINEL = Integer.MAX_VALUE;

  private List(int x, List next) {
    this.x = x;
    this.next = next;
  }

  public List() {
    this(SENTINEL, null);
  }

  public void insert(int data) {
    if (data > this.x) {
      next.insert(data);
    } else {
      next = new List(x, next);
      x = data;
    }
  }

  public boolean repOk() {
    Set<List> visited = new HashSet<List>();
    List curr = this;
    while (curr.x != SENTINEL) {
      // The list should acyclic
      if (!visited.add(curr))
        return false;
      // The list should be sorted
      List curr_next = curr.next;
      if (curr.x > curr_next.x)
        return false;

      curr = curr_next;
    }
    return true;
  }

  @Override
  public String toString() {
    if (x == SENTINEL) {
      return "null";
    } else {
      return x + ", " + next.toString();
    }
  }

}
