package app.test5.ap.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadNumber {

  public String[] readTxt() {
    ArrayList<String> lines = new ArrayList<>();
    try {
      File file = new File(System.getProperty("user.dir") + "/src.trial.java/app/test5/test/test.txt");
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
