package app.Scanner;

import java.util.Scanner;

/**
 * 5個のデータ入力後、最小な数を出力
 */
public class ScannerSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 入力は５回
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    int[] num = new int[] { a, b, c, d, e };
    int min = num[0];
    for (int i = 1; i < num.length; i++) {
      // min = Math.min(min,num[i]); // これでも可能

      // 現在の最小値よりも小さい値があった場合
      if (min > num[i]) {
        // 変数minに値を入れ替える
        min = num[i];
      }
    }
    System.out.println(min);
  }
}
