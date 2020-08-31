package app.sub8;

import java.util.Scanner;

public class StdinV01 {

  private static final int ZERO = 0;

  public static void main(String[] args) {
    new StdinV01().judge();
  }

//  StdinV01() {
//    new StdinV01().judge();
//  }

  private String input() {
    Scanner scan = new Scanner(System.in);
    String inputValue = scan.nextLine();
    return inputValue;
  }

  private void judge() {
    while (true) {
      System.out.print("> ");
      String inputValue = input();

      if (inputValue.length() == ZERO) {
        System.out.println("未入力です");
      } else if (inputValue.equals("Exit")) {
        break;
      } else {
        System.out.println(inputValue);
        continue;
      }
    }
  }
}