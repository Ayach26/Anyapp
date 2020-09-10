package app.test4.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import app.test4.ap.data.Consts;

/**
 * アルゴリズムテスト用 バブルソート(昇順)
 */
public class App {
  public static void main(String[] args) {
    new App().sort();
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

  // data変数の中身が0
  private void sort() {
    String[] list = this.getStdin();
//    lines.toArray(new String[lines.size()]);
    int[] data = new int[list.length];
    // 昇順ソート
    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          int asc = data[j];
          data[j] = data[j + 1];
          data[j + 1] = asc;
        }
      }
    }
    // ソート後の結果を出力
    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i] + " ");
    }
  }
}
