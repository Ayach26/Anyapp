package app.Scanner;
import java.util.Scanner;

/**
 * N個のデータの入力(スペース区切り)
 */
public class ScannerSplitSpace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();

    int value = Integer.parseInt(num);
    String[] str = sc.nextLine().split(" ");
    for (int i = 0; i < value; i++) {
      System.out.println(str[i]);
    }
  }
}
