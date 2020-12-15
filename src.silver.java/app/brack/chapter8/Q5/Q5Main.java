package app.brack.chapter8.Q5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q5Main {
  public static void main(String[] args) {
    List<Q5Sample> list = Arrays.asList(new Q5Sample(10),
        new Q5Sample(20),
        new Q5Sample(30));

    Predicate<Q5Sample> x = s -> list.contains(s);
    if(x.test(new Q5Sample(20))) {
      System.out.println("ok");
    }
  }
}