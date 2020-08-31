package app.sub6.ap.data;

import java.util.Random;

public class Cleric {

  final int MAX_HP = 50;
  final int MAX_MP = 10;
  final int MP_RICOVERY = 3;

  String name;
  int hp = 50;
  int mp = 10;

  void selfAid() {
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println(this.name + "は、回復魔法を使用");
    System.out.println("HPが最大まで回復した。");
  }

  /**
   * 祈ることで自身のMPを回復できます。
   * 回復量は祈った秒数にランダムなポイントの補正を加えた量です。
   * @param 祈る秒数
   * @return 回復したMP値
   */
  int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間祈った");

    // 論理上の回復量を乱数を用いて決定する
    int recover = new Random().nextInt(MP_RICOVERY) + sec;

    // 実際のMP量を計算する
    int recoverActual = Math.min(this.MAX_HP - this.hp, recover);
    this.mp += recoverActual;

    return recoverActual;
  }
}
