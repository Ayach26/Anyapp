package app.sub6.ap.data;

public class Enemy {

  /** 敵の体力 */
  int hp;
  /** 敵のレベル */
  final int LEVEL = 10;
  /** 敵の名前 */
  char suffix;

  void run() {
    System.out.println("敵" + this.suffix + "は逃げ出した");
  }
}
