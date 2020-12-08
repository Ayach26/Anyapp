package app.brack.chapter4.Q8;

public class Q6Sample {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++, period()) {
      System.out.print(i);
    }
  }

  private static void period() {
    System.out.print(",");
  }
}