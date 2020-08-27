package app.sub6.ap.data;

public class Hero {
  String name;
  int hp;

  void attack() {

  }

  void run() {
    System.out.println("GAME OVER");
    System.out.println(this.name + "は、逃げ出した。最終HPは" + this.hp );

  }

  void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った");
    System.out.println("HPが" + sec + "ポイント回復");
  }

  void silp() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ");
    System.out.println("5のダメージ");

  }

  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復");
  }
}
