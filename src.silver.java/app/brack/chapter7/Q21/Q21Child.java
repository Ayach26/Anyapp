package app.brack.chapter7.Q21;

public class Q21Child extends Q21Parent {
  public Q21Child() {
    super("B");
    System.out.println("C");
  }

  public Q21Child(String val) {
    this();
    System.out.println(val);
  }
}