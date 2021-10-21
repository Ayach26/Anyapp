package app.oneweek.basic.day10;

public class SampleEx302 {
  public static void main(String[] args) {
    Crow02 c = new Crow02();
    Sparrow02 s = new Sparrow02();

    System.out.print(c.getName()+":");
    c.sing();
    System.out.print(s.getName()+":");
    s.sing();
  }

}