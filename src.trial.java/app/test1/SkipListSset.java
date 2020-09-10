package app.test1;

/**
 * skip listは、ノードの高さをランダムに決め、
 * その都度左右のノードと繋ぐということを繰り返すという乱択データ構造。
 *
 * 連結リストを並列に連結させて作る。比較により順序づけ可能な要素を挿入し、
 * スキップリスト内ではソートされた状態で保持される。
 * 挿入も探索も削除もO(logN)となる。
 *
 * SkiplistSSet は、スキップリストを使った SSet I/Fの実装となる。
 * SSet I/Fの実装にスキップリストを使う場合、L0 にはSSet の要素を整列して格納する。
 * 探索経路に沿って y ≥ x を満たすような最小の y を探すメソッド find(x) を下記に示す。
 */
public class SkipListSset {

  public static void main(String[] args) {

  }
}
