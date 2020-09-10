package app.sub3;

import java.util.Random;
import java.util.Scanner;

public class NumberQuiz {

  /** 乱数の最大値 */
  private static final int MAX_NUMBER = 10;
  /** 最大入力回数 */
  private static final int COUNT = 5;

  public static void main(String args[]) {
    new NumberQuiz().start();
  }

  private void start() {
    int numbers = new Random().nextInt(MAX_NUMBER);
    for (int i = 0; i < COUNT; i++) {
      System.out.println("0~9の数字を入力してください。");
      int inputNumber = new Scanner(System.in).nextInt();
      this.judge(numbers, inputNumber);
    }
  }

  private void judge(int numbers, int inputNumber) {
    if (numbers == inputNumber) {
      System.out.println("collect");
    } else {
      System.out.println("miss");
    }
  }
}
