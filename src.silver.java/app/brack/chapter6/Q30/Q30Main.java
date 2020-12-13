package app.brack.chapter6.Q30;

public class Q30Main {
  public static void main(String[] args) {
    Q30Sample s = new Q30Sample(10);
    modify(s);
    System.out.println(s.num);
  }

  private static void modify(Q30Sample s) {
    s.num *= 2;
  }
}