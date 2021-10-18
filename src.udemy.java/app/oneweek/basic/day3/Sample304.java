package app.oneweek.basic.day3;

public class Sample304 {
  public static void main(String[] args) {
    // 1から7までの乱数を発生させる
    int dice = (int) (Math.random() * 7) + 1;
    System.out.println("さいころの目：" + dice);

    if (1 <= dice && dice <= 6) {
      //　偶数の場合
      if (dice == 2 || dice == 4 || dice == 6) {
        System.out.println("丁(チョウ)です。");
        //　奇数の場合
      } else {
        System.out.println("半(ハン)です。");
      }
    } else {
      System.out.println("範囲外の数値です。");
    }
  }
}