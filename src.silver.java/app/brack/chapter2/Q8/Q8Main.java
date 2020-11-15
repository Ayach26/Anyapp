package app.brack.chapter2.Q8;

/**
 * varによる型推論はコンパイル時に行われる。
 * 13行目をコンパイルする段階で変数aの型右オペランドの型であるBとして判断される
 * BクラスとCクラスには互換性がない
 * B型の変数aにCクラスのインスタンスへの参照を代入しようとするためコンパイルエラー
 *
 */
public class Q8Main {
  public static void main(String[] args) {
    // B a = new Q8B　のコードと同じ意味をもつ
    var a = new Q8B();
    // a = new Q8C();
    a.test();
  }
}
