package app.test3.ap.data;

public class EnglishNumberSelectors {

  /**
   * 定数クラスのためprivateコンストラクタ
   */
  private EnglishNumberSelectors() {

  }

  /**
   * 1~19以下の一意な数字
   */
  final static String[] UNIQUE_NUMBER = {
      "",
      " one",
      " two",
      " three",
      " four",
      " five",
      " six",
      " seven",
      " eight",
      " nine",
      " ten",
      " eleven",
      " twelve",
      " thirteen",
      " fourteen",
      " fifteen",
      " sixteen",
      " seventeen",
      " eighteen",
      " nineteen"
  };

  /**
   * 10~90以上の数字
   */
  final static String[] UP_TO_TEN = {
      "",
      "ten",
      "twenty",
      "thirty",
      "forty",
      "fifty",
      "sixty",
      "seventy",
      "eighty",
      "ninety"
  };
}
