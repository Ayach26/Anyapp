package app.oneweek.basic.day6;

public class Sample602 {

  public static void main(String[] args) {
    SampleClass01 s1, s2, s3;
    s1 = new SampleClass01();
    s2 = new SampleClass01();
    s3 = new SampleClass01();

    s1.n = 100;
    s1.n = 200;
    s3.n = 300;
    s1.s = "ABC";
    s2.s = "あいう";
    s3.s = "123";

    System.out.println(s1.add("DFG"));
    System.out.println(s2.add("えお"));
    System.out.println(s3.add("467"));
    s1.showNum();
    s2.showNum();
    s3.showNum();
  }
}