package DataStructures;

import java.io.Serializable;

/**
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 * This class implements sorted list of integers using a singly linked list with a sentintel node.
 */
public class SortedList implements Serializable {

  static final long serialVersionUID = 20200617L;

  private int x;
  private SortedList next;

  private static final int SENTINEL = Integer.MAX_VALUE;

  private SortedList(int x, SortedList next) {
    this.x = x;
    this.next = next;
  }

  public SortedList() {
    this(SENTINEL, null);
  }

  /**
   * Inserts the given element in the list
   */
  public void insert(int data) {
    if (data > this.x) {
      next.insert(data);
    } else {
      next = new SortedList(x, next);
      x = data;
    }
  }

  /**
   * Clear the list
   */
  public void clear() {
    x = SENTINEL;
    next = null;
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
