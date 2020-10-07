package app.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N行のデータの入力
 */
public class Scannerline {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int lineNumber = Integer.parseInt(line);

    ArrayList<String> anyValue = new ArrayList<>();
    for(int i = 0; i < lineNumber; i++) {
      String value = sc.nextLine();
      anyValue.add(value);
    }

    for(String value : anyValue) {
      System.out.println(value);
    }
  }
}
