package app.sub1;

public class CalcArea {

  public static void main(String[] args) {
    new CalcArea().ResultOutput();
  }

  private void ResultOutput() {
    double triangleArea = calcTriangleArea(Constants.BOTTOM, Constants.HEIGHT);
    double circleArea = calcCicleArea(Constants.RADIUS);

    System.out.println("三角形の面積:" + triangleArea + "平方cm");
    System.out.println("円の面積:" + circleArea + "平方cm");
  }

  private double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / Constants.DIVIDE;
    return area;
  }

  private double calcCicleArea(double radius) {
    double area = radius * radius * Constants.PI;
    return area;
  }
}
