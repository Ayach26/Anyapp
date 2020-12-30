package app.brushup.chapter3.Q4;

public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = a++ + a + a-- - a-- + ++a;
    System.out.println(b);

    int c = 10;
    int d = 10;
    int e = 10;
    int f = 10;
    // 11
    System.out.println("++c:" + ++c);
    // 10
    System.out.println("d++:" + d++);
    // 9
    System.out.println("--e:" + --e);
    // 10
    System.out.println("f--:" + f--);
  }
}