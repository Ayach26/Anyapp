package app.test1;

/**
 * 空間効率の良い方法でスキップリストを実装するには、ノード u がデータ x
 * とポインタの配列 next を含むようにし、u.next[i] が Li における u の次の
 * ノードを指すようにすればよい。x は複数のリストに現れることがあるが、こ
 * うすればノードとしての実体は 1 つだけあれば済む。
 */
public class Node<T> {
  T x;
  int height;
  Node<T> next[];

  Node(T x, int height, Node<T> next[]) {
    this.x = x;
    this.height = height;
    this.next = next;
  }
}
