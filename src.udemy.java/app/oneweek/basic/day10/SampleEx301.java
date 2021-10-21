package app.oneweek.basic.day10;

public class SampleEx301 {
  public static void main(String[] args) {
    Crow01 c = new Crow01();
    Sparrow01 s = new Sparrow01();

    System.out.print(c.getName()+":");
    c.sing();
    System.out.print(s.getName()+":");
    s.sing();
  }

}