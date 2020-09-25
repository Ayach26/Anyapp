package app.test6.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bmi {
  public static void main(String[] args) {

  }

  private void output() {

  }

  public String[] readTxt() {
    ArrayList<String> lines = new ArrayList<>();
    try {
      // テストケース入力用
      File file = new File(System.getProperty("user.dir") + "/src.trial.java/app/test6/test/test.txt");
      Scanner scanner = new Scanner(file);

      // 入力がn個のため、hasNext()メソッド使用
      while (scanner.hasNext()) {
        lines.add(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return lines.toArray(new String[lines.size()]);
  }
}
