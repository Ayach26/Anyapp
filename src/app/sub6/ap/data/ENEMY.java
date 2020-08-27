package app.sub6.ap.data;

public class Enemy {
  int hp;
  final int LEVEL = 10;
  char suffix;

  void run() {
    System.out.println("敵" + this.suffix + "は逃げ出した");
  }
}
