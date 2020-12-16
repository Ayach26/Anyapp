package app.brack.chapter9.Q19;

import java.util.HashMap;
import java.util.Map;

public class Q19Sample {
  public static void main(String[] args) {
    Map<Integer, Q19Item> map = new HashMap<Integer, Q19Item>();
    map.put(1, new Q19Item(1, "A"));
    map.put(2, new Q19Item(2, "B"));
    map.put(3, new Q19Item(3, "C"));
    map.put(1, new Q19Item(1, "A"));
    map.put(null, new Q19Item(0, "default"));

    System.out.println(map.size());
  }
}