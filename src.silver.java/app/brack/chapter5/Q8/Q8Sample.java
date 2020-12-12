package app.brack.chapter5.Q8;

/**
 * 実行時に例外(NullPointerException)がスロー
 */
public class Q8Sample {
  public static void main(String[] args) {
    String[][] array = { { "A", "B" }, null, { "C", "D", "E" } };
    int total = 0;
    for (String[] tmp : array) {
      total += tmp.length;
    }
    System.out.println(total);
  }
}