package app.sub7;
import java.util.Scanner;

/**
 * TODO 例外処理、配列からリストへ変更
 */
public class Calculator {

//  private static final int MAX_INPUT_NUMBER = 2;
  private static final int MAX_NUMBER = 9999;
  private static final int MAX_NG_NUMBER = 10000;

  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.start();
    c.inputNumber();
  }

  private void start() {
    System.out.println("半角スペース区切りで数字を入力してください。");
  }

  private void inputNumber() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] arrayNumber = line.split(" ");

    int num1 = Integer.parseInt(arrayNumber[0]);
    int num2 = Integer.parseInt(arrayNumber[1]);
    this.judge(num1, num2);
  }

  private int calc(int num1, int num2) {
    return num1 * num2;
  }

  private int judge(int num1, int num2) {
    int calc = this.calc(num1, num2);
    if (calc <= MAX_NUMBER) {
      System.out.println(calc);
    } else if (calc >= MAX_NG_NUMBER) {
      System.out.println("NG");
    }
    return calc(num1, num2);
  }
}
