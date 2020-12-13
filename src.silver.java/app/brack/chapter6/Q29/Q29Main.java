package app.brack.chapter6.Q29;

public class Q29Main {
  public static void main(String[] args) {
    Q29Sample s = new Q29Sample(10);
    modify(s.num);
    System.out.println(s.num);
  }

  private static void modify(int num) {
    num += 2;
  }
}