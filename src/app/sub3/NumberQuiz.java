package app.sub3;

import java.util.Scanner;

public class NumberQuiz {

  private static int[] NUMBERS = { 3, 4, 9 };

  public static void main(String args[]) {
    new NumberQuiz().start();
  }

  private void start() {
    System.out.println("1桁の数字を入力してください。");
    this.process();
  }

  private void process() {
    int input = new Scanner(System.in).nextInt();
    for (int n : NUMBERS) {
      if (n != input) {
        System.out.println("miss");
        break;
      } else {
        System.out.println("collect");
      }
    }
  }
}
