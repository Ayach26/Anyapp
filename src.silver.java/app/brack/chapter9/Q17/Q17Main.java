package app.brack.chapter9.Q17;

import java.util.List;

public class Q17Main {
  public static void main(String[] args) {
    List<String> list = List.of("A", "B", "C");
    // どちらでも可能
    list.forEach(str -> System.out.println(str));
//    list.forEach(System.out::println);
  }
}