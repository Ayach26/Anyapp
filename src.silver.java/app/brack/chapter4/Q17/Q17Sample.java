package app.brack.chapter4.Q17;

public class Q17Sample {
  public static void main(String[] args) {
    int total = 0;
    a: for (int i = 0; i < 5; i++) {
      b: for (int j = 0; j < 5; j++) {
        if (i % 2 == 0)
          continue a;
        if (3 < j)
          continue b;
        total += j;
      }
    }
    System.out.println(total);
  }
}