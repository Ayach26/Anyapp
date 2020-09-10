package app.sub4;

public class OverLoad {

  private int add(int x, int y) {
    return x + y;
  }

  private double add(double x, double y) {
    return x + y;
  }

  private String add(String x, String y) {
    return x + y;
  }

  public static void main(String args[]) {
    OverLoad ol = new OverLoad();
    System.out.println(ol.add(10, 20));
    System.out.println(ol.add(3.5, 2.7));
    System.out.println(ol.add("Hello", "World"));
  }
}
