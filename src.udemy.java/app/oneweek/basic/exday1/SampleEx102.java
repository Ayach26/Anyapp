package app.oneweek.basic.exday1;

public class SampleEx102 {

  public static void main(String[] args) {
    SampleEx102 i = new SampleEx102();
    i.foo();
    // インスタンスからも静的メソッドを呼べるが推奨しない(インスタンスメソッドの誤解が生まれる)
    i.bar();
    //　クラス名からの呼び出し
    SampleEx102.bar();
    // クラス名なしの呼び出し
    bar();
    // ガーベージコレクタの呼び出し
    System.gc();
  }

  public SampleEx102() {
    System.out.println("コンストラクタ");
  }

  public void foo() {
    System.out.println("インスタンスメソッド");
  }

  public static void bar() {
    System.out.println("静的メソッド");
  }
}