package app.rank.c;

import java.util.Scanner;

/**
 * 文字列の周りを"+"で囲み出力する
 */
public class QualifyWithSymbol {

  public static final int SYMBOL = 3;

  public static void main(String[] args) {
    new QualifyWithSymbol().view();
  }

  private void view() {
    String str = this.scanner();
    this.calc(str);
    System.out.println();
    System.out.println("+" + str + "+");
    this.calc(str);
  }

  private String scanner() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    return line;
  }

  private void calc(String str) {
    for (int i = 1; i < str.length() + SYMBOL; i++) {
      System.out.print("+");
    }
  }
}
