package app.brack.chapter8.Q1;

public class Q1Main {
  public static void main(String[] args) {
    Q1Algorithm algorithm = (name) -> {
      System.out.println("hello," + name);
    };

    Q1Service s = new Q1Service();
    s.setyLogic(algorithm);
    s.doProcess("Lambda");
  }
}
