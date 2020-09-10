package app.sub5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 入力された2つの数の和を出力するプログラム。
 *
 * 条件は以下となる。
 * 1.入力する数は、共に整数とする。
 * 2.負の数も含む。負の数の場合は、数値の直前に空白を挟まず「-」（マイナス）を
 *   付加して入力するものとし、数値の範囲は-10000～10000とする。
 */
public class ArrayElement {

  /** 最大入力回数 */
  private static final int COUNT = 2;

  public static void main(String args[]) {
    new ArrayElement().resultOutput();
  }

  /**
   * 入力された値のリストを作成します。
   * @return 入力値リスト
   */
  private List<Integer> inputNumbers() {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numberList = new ArrayList<>();

    for(int i = 0; i < COUNT; i++) {
      System.out.println("数字を入力してください。");
      Integer InputNumber = scanner.nextInt();
      numberList.add(InputNumber);
    }
    return numberList;
  }

  /**
   * 入力された値の計算をします。
   * @return 入力した値の合計
   * TODO 引数にsumを用いたい、mainメソッドでの上手い振る舞い方
   */
  private int calcNumber() {
    List<Integer> numberList = inputNumbers();
    int sum = 0;
    for(Integer number : numberList ) {
      sum += number;
    }
    return sum;
  }

  private void resultOutput() {
    int totalNumber = calcNumber();
    System.out.print("入力された合計は、" + totalNumber + "です。");
  }
}
