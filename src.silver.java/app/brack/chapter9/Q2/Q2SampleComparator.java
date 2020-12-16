package app.brack.chapter9.Q2;

import java.util.Comparator;

public class Q2SampleComparator implements Comparator<Q2Sample> {
  @Override
  public int compare(Q2Sample s1, Q2Sample s2) {
    if(s1.getId() < s2.getId()) {
      return 1;
    }

    if(s2.getId() < s1.getId()) {
      return -1;
    }

    return 0;
  }
}
