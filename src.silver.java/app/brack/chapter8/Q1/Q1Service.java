package app.brack.chapter8.Q1;

public class Q1Service {
  private Q1Algorithm logic;

  public void setyLogic(Q1Algorithm logic) {
    this.logic = logic;
  }

  public void doProcess(String name) {
    System.out.println("start");
    this.logic.perform(name);
    System.out.println("end");
  }
}
