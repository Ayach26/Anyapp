package app.brack.chapter6.Q2;

public class Q2Main {
  public static void main(String[] args) {
    Q2Sample a = new Q2Sample();
    Q2Sample b = new Q2Sample();

    a.name = "apple";
    b.price = 100;
    a.price = 200;
    b.name = "banana";
    a = b;
    a.printInfo();
  }
}
