package app.test4.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import app.test4.ap.data.Consts;

public class App {
  public static void main(String[] args) {
    new App().output();
  }

  private void output() {
    String[] lines = this.getStdin();
    for (int i = 0; i < lines.length; i++) {
      System.out.println(lines[i]);
    }
  }

  private String[] getStdin() {
//    System.out.println(System.getProperty("user.dir"));
    ArrayList<String> lines = new ArrayList<>();
    try {
      File file = new File(Consts.FILE_PATH);
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
