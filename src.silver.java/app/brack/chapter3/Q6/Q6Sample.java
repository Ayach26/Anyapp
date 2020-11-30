package app.brack.chapter3.Q6;

public class Q6Sample {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    if (10 < a && 10 < ++b) {
      a++;
    }
    System.out.println(a + b);
  }
}