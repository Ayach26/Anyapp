package app.brack.chapter6.Q5;

public class Q5Main {
  public static void main(String[] args) {
    Q5Sample.num = 10;
    Q5Sample s = new Q5Sample();
    Q5Sample s2 = new Q5Sample();
    s.num += 10;
    s2.num = 30;
    System.out.println(Q5Sample.num);
  }
}
