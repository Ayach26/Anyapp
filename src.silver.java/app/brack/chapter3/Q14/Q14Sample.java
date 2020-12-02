package app.brack.chapter3.Q14;

public class Q14Sample {
  public static void main(String[] args) {
    String a = "abc";
    String b = new String(a);

    int count = 0;
    if (a.intern() == "abc") {
      count++;
    }
    if (b.intern() == "abc") {
      count++;
    }
    if (a.intern() == b.intern()) {
      count++;
    }
    System.out.println(count);
  }
}