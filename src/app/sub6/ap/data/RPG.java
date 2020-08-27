package app.sub6.ap.data;

public class RPG {
  public static void main(String args[]) {
    new RPG();
  }

  public RPG() {
    this.adventure();
  }

  void adventure() {
    System.out.println("RPG");
    this.hero();
    this.enemy();
  }

  void hero() {
    Hero h = new Hero();

    h.name = "heroA";
    h.hp = 100;

    // TODO この処理移植
    h.sit(5);
    h.slip();
    h.sit(25);
    h.slip();
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
