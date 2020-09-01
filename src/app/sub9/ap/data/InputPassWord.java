package app.sub9.ap.data;

import java.util.Scanner;

/**
 * パスワードの入力を受け付けるクラス
 */
public class InputPassWord {

  public String input() {
    Scanner scan = new Scanner(System.in);
    String value = scan.nextLine();
    return value;
  }
}
