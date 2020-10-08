package app.Scanner;

import java.util.Scanner;

/**
 * 複数行に渡る入力
 * 
 * 1行目には整数 n が与えられ、
 * 2行目から (n+1) 行目にかけては
 * n 個の整数 a_1, ..., a_n が改行区切りで与えられる。
 */
public class ScannerMultipleLines {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int line = sc.nextInt();
    int[] value = new int[line];
    
    for (int i : value) {
      value[i] = sc.nextInt();
      System.out.println(value[i]);
    }
  }
}
