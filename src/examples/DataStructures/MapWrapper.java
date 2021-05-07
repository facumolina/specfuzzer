package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapWrapper {

  private Map<Integer, Integer> map;

  public MapWrapper() {
    map = new HashMap<>();
  }

  public void add(Integer key, Integer value) {
    map.put(key, value);
  }

}
