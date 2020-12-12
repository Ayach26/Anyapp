package app.brack.chapter5.Q5;

/**
 * 実行時に例外(NullPointerException)がスロー
 */
public class Q5Main {
  public static void main(String[] args) {
    Q5Sample[] samples = new Q5Sample[3];
    int total = 0;
    for (int i = 0; i < samples.length; i++) {
      total += samples[i].price;
    }
    System.out.println(total);
  }
}