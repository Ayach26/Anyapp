package app.brack.chapter9.Q11;

public class Q11Item {
  private String name;
  private int price;

  public Q11Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Q11Item) {
      Q11Item tmp = (Q11Item) obj;
      if (tmp.name.equals(this.name)) {
        return true;
      }
    }
    return false;
  }

  public String getName() {
    return name;
  }
}
