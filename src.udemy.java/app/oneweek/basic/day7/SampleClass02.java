package app.oneweek.basic.day7;

public class SampleClass02 {

  private int num = 1;

  public SampleClass02() {
    System.out.println("コンストラクタ");
  }

  private void method1() {
    System.out.println("method1(private)");
  }

  public void method2() {
    System.out.println("method2(public)");
  }

  public void method3() {
    method1();
    System.out.println("method3(public) : num=" + this.num);
  }
}
