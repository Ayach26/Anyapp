package app.brack.chapter3.Q4;

public class Q4Sample {
  public static void main(String[] args) {
    int a =10;
    int b = a++ + a + a-- - a-- + ++a;
    System.out.println(b);
  }
}
