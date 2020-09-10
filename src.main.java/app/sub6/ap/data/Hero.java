package app.sub6.ap.data;

public class Hero {

  /** 勇者の名前 */
  String name;
  /** 勇者の体力 */
  int hp;
  /** 勇者が装備している剣の情報 */
  Sword sword;

  /**
   * 引数なしコンストラクタ
   */
  Hero() {
    this.name = "heroA";
    this.hp = 100;
  }

  /**
   * コンストラクタ
   * @param 勇者の名前
   */
  Hero(String name) {
    this.name = name;
    this.hp = 100;
  }

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

  void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ");
    System.out.println("5のダメージ");

  }

  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復");
  }
}
