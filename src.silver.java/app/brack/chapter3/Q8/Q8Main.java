package app.brack.chapter3.Q8;

public class Q8Main {
  public static void main(String[] args) {
    Q8Sample s1 = new Q8Sample(10);
    Q8Sample s2 = s1;
    s1 = new Q8Sample(10);
    System.out.println(s1 == s2);

  }
}