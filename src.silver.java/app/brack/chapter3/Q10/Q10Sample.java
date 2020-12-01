package app.brack.chapter3.Q10;

public class Q10Sample {
  private int num;

  public Q10Sample(int num) {
    this.num = num;
  }

  public boolean equals(Q10Sample obj) {
    if (obj == null) {
      return false;
    }
    return this.num == obj.num;
  }
}
