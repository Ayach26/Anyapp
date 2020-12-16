package app.brack.chapter9.Q15;

import java.util.Arrays;

public class Q15Main {
  public static void main(String[] args) {
    String[] a = {"b", "c"};
    String[] b = {"a", "b", "c"};
    System.out.println(Arrays.mismatch(a, b));
  }
}