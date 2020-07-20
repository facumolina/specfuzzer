package DataStructures;

public class AvlTreeListTester {
  private static AvlTreeList<Integer> avl = new AvlTreeList<Integer>();

  public static void doNew(int size) {
    avl = new AvlTreeList<Integer>();
    avl.add(size);
  }

  public static void fill(int n) {
    doNew(n);
    for (int i = 0; i < n; i++) {
      avl.add(i);
      avl.add(-i);
    }
    doNew(n);
    for (int i = 0; i <= n / 2; i++) {
      avl.add(i);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      doNew(0);
      fill(i);
      fill(-i);
      fill(10);
      fill(-10);
      fill(20);
      fill(-20);
    }
  }

}
