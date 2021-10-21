package app.oneweek.basic.day9;

public class Car {

  /** 燃料 */
  private int fuel = 0;
  /** 移動距離 */
  private int migration = 0;

  public Car() {
    System.out.println("Carオブジェクト生成");
  }

  public void move() {
    // 燃料がある場合、移動する
    if (fuel >= 0) {
      migration++;
      fuel--;
    }
    System.out.println("移動距離 : " + migration);
    System.out.println("燃料 : " + fuel);
  }

  public void supply(int fuel) {
    if (fuel > 0) {
      this.fuel += fuel;
    }
    System.out.println("燃料 : " + fuel);
  }
}