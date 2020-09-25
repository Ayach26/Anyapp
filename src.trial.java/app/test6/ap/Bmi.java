package app.test6.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bmi {

  private final int ZERO = 0;

  public static void main(String[] args) {
    new Bmi().output();
  }

  private void output() {
    double weight;
    double height;
    double expectBmi;

    String[] lines = this.readTxt();
    for(int i = 0; i < lines.length; i++) {
      String[] value = lines[i].split(" ");

      weight = Double.parseDouble(value[0]);
      height= Double.parseDouble(value[1]);
      expectBmi= Double.parseDouble(value[2]);

      this.bmi(weight, height, expectBmi);
    }
  }

  private void bmi(double weight, double height, double expectBmi) {
    double bmi = 10000 * weight / (height * height);
    if(expectBmi >= bmi) {
      System.out.println(ZERO);
    } else {
      double calc = (expectBmi * (height * height)) /10000;
      double result = weight - calc;
      System.out.println((int)Math.ceil(result));
    }
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
