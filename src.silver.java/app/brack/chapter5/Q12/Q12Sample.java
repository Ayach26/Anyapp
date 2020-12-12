package app.brack.chapter5.Q12;

public class Q12Sample {
  public static void main(String[] args) {
    int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
    int[][] arrayB = arrayA.clone();
    int total = 0;
    for (int[] tmp : arrayB) {
      for (int val : tmp) {
        total += val;
      }
    }
//  System.out.println(arrayA[2][2]);
    System.out.println(total);
  }
}