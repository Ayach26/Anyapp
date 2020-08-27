package app.sub6.ap.data;

public class Cleric {

  final int MAX_HP = 50;
  final int MAX_MP = 10;

  String name;
  int hp = 50;
  int mp = 10;

  void selfAid() {
    this.hp = this.MAX_HP;
    this.mp -= 5;
  }
}
