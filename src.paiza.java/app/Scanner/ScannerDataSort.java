package app.Scanner;

import java.util.Scanner;

/**
 * 5個のデータ入力後、最小な数を出力
 * 入力される要素数で並び替えする場合(昇順)
 */
public class ScannerDataSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] value = new int[num];

    int max = 0;
    for (int i = 0; i < value.length; i++) {
      value[i] = sc.nextInt();
      // 入力される数値が大きい場合は、数を入れ替えていく
      if (max < value[i]) {
        max = value[i];
      }
    }
    System.out.println(max);
  }
}
