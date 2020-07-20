package DataStructures;

public class ListTester {
  private static List l = new List();

  public static void doNew(int size) {
    l = new List();
    l.insert(size);
  }

  public static void fill(int n) {
    doNew(n);
    for (int i = 0; i < n; i++) {
      l.insert(i);
      l.insert(-i);
    }
    doNew(n);
    for (int i = 0; i <= n / 2; i++) {
      l.insert(i);
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
