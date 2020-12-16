package app.brack.chapter9.Q11;

import java.util.ArrayList;

public class Q11Main {
  public static void main(String[] args) {
    ArrayList<Q11Item> list = new ArrayList<>();
    list.add(new Q11Item("A", 100));
    list.add(new Q11Item("B", 200));
    list.add(new Q11Item("C", 300));
    list.add(new Q11Item("A", 100));
    list.remove(new Q11Item("A", 500));
    for (Q11Item item : list) {
      System.out.println(item.getName());
    }
  }
}