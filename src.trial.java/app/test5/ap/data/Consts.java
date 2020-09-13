package app.test5.ap.data;

public class Consts {

  /**
   * 定数クラスのためprivateコンストラクタ
   */
  private Consts() {

  }

  public static final int ZERO = 0;

  public static final int DIGIT_ONE = 1;

  public static final int DIGIT_TWO = 2;

  public static final int DIGIT_THREE = 3;

  public static final int DIGIT_FOUR = 4;

  public static final int DIGIT_FIVE = 5;

  public static final int DIGIT_SIX = 6;

  // 3桁
  public static String HUNDRED = "hundred";
  // 4桁
  public static String THOUSAND = "thousand";
  // 5桁
  public static String MILLION = "million";
  // 6桁
  public static String BILLION = "billion";

  /**
   * 1~9以上の数字
   */
  public final static String[] ONE_TO_TEN = {
      "",
      "One",
      "Two",
      "Three",
      "Four",
      "Five",
      "Six",
      "Seven",
      "Eight",
      "Nine",
   };

  /**
   * 11~19以上の数字
   */
  public final static String[] ELEVEN_TO_NINETEEN = {
      "",
      "Eleven",
      "Twelve",
      "Thirteen",
      "Fourteen",
      "Fifteen",
      "Sixteen",
      "Seventeen",
      "Eighteen",
      "Nineteen"
   };

  /**
   * 10~90以上の数字
   */
  public final static String[] TEN_TO_NINETY = {
      "",
      "Ten",
      "Twenty",
      "Thirty",
      "Forty",
      "Fifty",
      "Sixty",
      "Seventy",
      "Eighty",
      "Ninety"
   };
}
