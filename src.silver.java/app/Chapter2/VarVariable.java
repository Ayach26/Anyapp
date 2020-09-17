package app.Chapter2;

public class VarVariable {
  // コンパイルエラー メンバ変数に var 使用不可(以下はインスタンス変数)
  //  var a = 100;
  // コンパイルエラー メンバ変数に var 使用不可(以下はstatic変数)
  //  static var b = 100;

  void var() {
    // String型の代入によりString型となる
    var c = "hello";
    // int型の代入によりint型となる
    var d = 100;

    // 初期値を指定しない場合 varは使用不可
    // var e;
    // コンパイルエラー nullの場合、変数fの型推論が不可
    // var f = null;
    // 定数でも使用可能
    final var G = 100;
  }
}
