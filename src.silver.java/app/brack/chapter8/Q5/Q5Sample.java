package app.brack.chapter8.Q5;

public class Q5Sample {
  private int num;

  public Q5Sample(int num) {
    this.num = num;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Q5Sample == false) {
      return false;
    }

    if (this.num == ((Q5Sample) obj).num) {
      return true;
    }
    return false;
  }
}
