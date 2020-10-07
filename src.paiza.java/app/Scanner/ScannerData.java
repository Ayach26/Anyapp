package app.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N個のデータの入力
 */
public class ScannerData {
  public static void main(String[] args) {
    ArrayList<String> lines = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }

    String[] line = lines.toArray(new String[lines.size()]);

    for (int i = 0; i < line.length; i++) {
      String[] value = line[i].split(" ");
      for (String v : value) {
        System.out.println(v);
      }
    }
  }
}
