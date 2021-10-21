package app.oneweek.basic.day10;

public abstract class Bird {
  private String name;

  Bird(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  abstract void sing();
}