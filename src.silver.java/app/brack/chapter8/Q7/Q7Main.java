package app.brack.chapter8.Q7;

import java.util.function.Function;

public class Q7Main {
  public static void main(String[] args) {
    Function<String, Integer> f = (str) -> {
      return Integer.parseInt(str);
    };
    System.out.println(f.apply("100") * 2);
  }
}