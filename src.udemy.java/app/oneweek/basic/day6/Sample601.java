package app.oneweek.basic.day6;

public class Sample601 {

  public static void main(String[] args) {
    // インスタンス生成
    SampleClass01 s = new SampleClass01();
    s.n = 100;
    s.s = "Hello";
    int ans = s.add(1, 2);
    String str = s.add("World");
    System.out.println(ans);
    System.out.println(str);
    s.showNum();
  }
}