package app.oneweek.basic.day8;

public class SampleClassEx01 {
  private int value = 0;
  private static int num = 0;

  public SampleClassEx01(int value) {
    this.value = value;
    // 静的メンバのインクリメント
    num++;
  }

  // 引数つきのコンストラクタ呼び出す
  public SampleClassEx01() {
    this(100);
  }

  public static int getNumberOfInstance() {
    return num;
  }

  public int getValue() {
    return this.value;
  }
}