package app.rank.c;

import java.util.Scanner;

/**
 * 整数 N が入力として与えられます。
 *
 * 1からNまでの整数を1から順に表示してください。
 * ただし、表示しようとしている数値が、
 * ・3の倍数かつ5の倍数のときには、"Fizz Buzz"
 * ・3の倍数のときには、"Fizz"
 * ・5の倍数のときには、"Buzz"
 *
 * を数値の代わりに表示してください。
 *
 */
public class FizzBuzz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int line = sc.nextInt();
    for (int i = 1; i <= line; i++) {
      if (i % 15 == 0) {
        System.out.println("Fizz Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
