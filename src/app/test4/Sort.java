package app.test4;

import java.util.Arrays;

public class Sort {

  public static void main(String[] args) {

    final int[] LIST = { 4, 2, 7, 9, 8, 10 };

    Arrays.sort(LIST);
    for(int i : LIST) {
      System.out.println(i);
    }
  }
}
