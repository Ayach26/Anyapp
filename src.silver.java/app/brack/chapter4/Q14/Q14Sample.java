package app.brack.chapter4.Q14;

public class Q14Sample {
  public static void main(String[] args) {
    String[] array = { "A", "B" };
    for (String a : array) {
      for (String b : array) {
        if ("B".equals(b))
          break;
          System.out.print(b);
      }
    }
  }
}