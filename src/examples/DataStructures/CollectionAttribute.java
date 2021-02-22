package DataStructures;

import java.util.LinkedList;
import java.util.List;

/**
 * Class to assess grammar generation and fuzzed specs evaluation when a Collection attribute is present.
 * @author Facundo Molina
 */
public class CollectionAttribute {

  private List<Integer> positives;
  private List<Object> nonNullList;
  private List allowNullList;
  private List nullList;

  public CollectionAttribute() {
    // List of positives
    positives = new LinkedList<>();
    positives.add(1);
    positives.add(2);
    positives.add(6);
    positives.add(1);
    positives.add(5);
    // List of non null objects
    nonNullList = new LinkedList<Object>();
    nonNullList.add("Str1");
    nonNullList.add("Str2");
    nonNullList.add(new LinkedList<>());
    // List allowing null
    allowNullList = new LinkedList<>();
    allowNullList.add(null);
    allowNullList.add(3);
    allowNullList.add("Str");
  }

}
