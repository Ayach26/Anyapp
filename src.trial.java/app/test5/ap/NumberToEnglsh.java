package app.test5.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import app.test5.ap.data.Consts;

public class NumberToEnglsh {
  public static void main(String[] args) {
    new NumberToEnglsh().output();
  }

  private void output() {
    int count;
    String[] lines = this.getStdin();
    for (int i = 0; i < lines.length; i++) {
      if(lines[i].length() == Consts.DIGIT_THREE) {
        int digitOne = Integer.parseInt(lines[i].substring(0,1));
        String result = Consts.ONE_TO_TEN[digitOne] + " " + Consts.HUNDRED;
        System.out.println(result);
      }
    }
  }
  private String[] getStdin() {
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
