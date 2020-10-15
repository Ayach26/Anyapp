package app.sub6.ap.data;

public class RPG {

  Hero h = new Hero();

  public static void main(String args[]) {
//    new RPG();
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Hero.money = 100;
    // Heroクラスの箱 moneyを表示
    System.out.println(Hero.money);
    System.out.println(h1.money);
    h1.money = 300;
    System.out.println(h2.money);
  }

  public RPG() {
    this.adventure();
  }

  void adventure() {
    System.out.println("RPG");
    this.hero();
    this.enemy();
    this.sword();
    this.wizard();
  }

  void sword() {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    h.sword = s;
    System.out.println("現在の武器は" + h.sword.name);
  }

  void hero() {
    h.name = "heroA";
//    h.hp = 100;

    // TODO この処理移植
    h.sit(5);
    h.slip();
    h.sit(25);
    h.slip();
  }

  void wizard() {
    Wizard w = new Wizard();
    w.heal(h);
  }

  void enemy() {
    Enemy e1 = new Enemy();
    Enemy e2 = new Enemy();

    e1.hp = 50;
    e1.suffix = 'Z';

    e2.hp = 48;
    e2.suffix = 'X';

    // TODO この処理移植
    e1.run();
    e2.run();

  }
}
