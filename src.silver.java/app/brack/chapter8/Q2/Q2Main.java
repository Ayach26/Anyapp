package app.brack.chapter8.Q2;

public class Q2Main {
  public static void main(String[] args) {
//    Funcion f = (name) -> {
//      return "hello, " + name;
//    };
//  java.util.function.Function f = name -> {
//  return "hello, " + name;
//};
    Function f = (name) -> "hello, " + name;
    System.out.println(f.test("Lambda"));
  }

  private static interface Function {
    String test(String name);
  }
}