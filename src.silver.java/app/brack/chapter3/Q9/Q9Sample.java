package app.brack.chapter3.Q9;

public class Q9Sample {
  private int num;
  private String name;

  public Q9Sample(int num, String name) {
    this.num = num;
    this.name = name;
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj instanceof Q9Sample) {
      Q9Sample s = (Q9Sample) obj;
      return s.num == this.num;
    }
    return false;
  }
}
