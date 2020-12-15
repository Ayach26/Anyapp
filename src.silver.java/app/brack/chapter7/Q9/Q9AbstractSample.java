package app.brack.chapter7.Q9;

abstract class Q9AbstractSample {
  public void sample() {
    System.out.println("A");
    test();
    System.out.println("C");
  }

  protected abstract void test();
}
