package app.test7.ap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 今いる場所or目的地が '/' だった場合 => '/'じゃない方のsplit要素数を返却
 * 例：
 * 入力が　'/' '/hoge/fuga'　だった場合
 * => 'hoge/fuga' を / でsplit => 要素数は二つな為、それがそのまま移動に必要な数(二回cd)
 * 入力が　'/hoge/fuga'　'/' だった場合
 * => 'hoge/fuga' を / でsplit => 要素数は二つな為、それがそのまま移動に必要な数(二回cd..)
 */
public class Directory {

  public static void main(String[] args) {
    new Directory().output();
  }

  private void output() {
    String[] lines = this.readTxt();
    for (int i = 0; i < lines.length; i++) {
      String[] value = lines[i].split(" ");
      String[] one = value[0].split("/");
      String[] two = value[1].split("/");
      System.out.println(one[0]);
      System.out.println(two[0]);

      int count = 0;
      if (one.length > two.length) {
        for (int j = 0; j < one.length; j++) {
          if (!one[j].equals(two[j])) {
            count++;
          }
        }

      } else {
        for (int k = 0; k < two.length; k++) {
          if (!one[k].equals(two[k])) {
            count++;
          }
        }
      }
      System.out.println(count +1);
    }
  }

  public String[] readTxt() {
    ArrayList<String> lines = new ArrayList<>();
    try {
      // テストケース入力用
      File file = new File(System.getProperty("user.dir") + "/src.trial.java/app/test7/test/test.txt");
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
