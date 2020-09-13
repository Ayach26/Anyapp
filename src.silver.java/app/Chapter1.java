package app;

/**
 * ループ処理速度計測
 * P16
 */
public class Chapter1 {

  private static final int LOOP_TIMES =  10000000;

  public static void main(String[] args) {
    int result = 0;
    long start = System.currentTimeMillis();

    for(int i = 0; i < LOOP_TIMES; i++) {
      // 変数に加算結果を格納
      result += i;
    }

    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");
  }
}
