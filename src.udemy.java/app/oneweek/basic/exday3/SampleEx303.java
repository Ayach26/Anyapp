package app.oneweek.basic.exday3;

public class SampleEx303 {
  public static void main(String[] args) {
    Bird b[] = new Bird[2];
    b[0] = new Crow02();
    b[1] = new Sparrow02();

    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i].getName() + ":");
      b[i].sing();
    }
  }
}