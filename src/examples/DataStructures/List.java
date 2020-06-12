package DataStructures;

/**
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class List {

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

}
