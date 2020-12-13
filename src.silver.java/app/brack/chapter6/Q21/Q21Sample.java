package app.brack.chapter6.Q21;

public class Q21Sample {
  Q21Sample() {
    System.out.println("A");
  }

  //　初期化子 コンストラクタが実行される前に実行される
  {
    System.out.println("B");
  }
}