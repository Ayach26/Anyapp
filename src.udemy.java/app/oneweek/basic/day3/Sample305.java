package app.oneweek.basic.day3;

public class Sample305 {
  public static void main(String[] args) {
    int num = 1;
    // バージョンによってswitch文が扱えるデータの型が異なってくる
    switch (num) {
    case 1:
      System.out.println("one");
      break;
    case 2:
      System.out.println("two");
      break;
    case 3:
      System.out.println("three");
      break;
    default:
      System.out.println("不適切な値です。");
    }
  }
}