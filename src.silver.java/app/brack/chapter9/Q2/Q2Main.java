package app.brack.chapter9.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2Main {
  public static void main(String[] args) {
    Q2Sample[] samples = {
        new Q2Sample(2, "B"),
        new Q2Sample(3, "C"),
        new Q2Sample(1, "A")
        };

    List<Q2Sample> list = new ArrayList<Q2Sample>(Arrays.asList(samples));
    list.sort(new Q2SampleComparator());
    for (Q2Sample s : list) {
      System.out.println(s.getName());
    }
  }
}