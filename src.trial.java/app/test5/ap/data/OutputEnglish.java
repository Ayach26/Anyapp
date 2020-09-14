package app.test5.ap.data;

/**
 * 入力された数字を英語表記へコンバートするクラス
 * TODO NumberConvertクラスへコンバート処理を移植する
 */
public class OutputEnglish {

  public String[] output() {
    String[] lines = new ReadNumber().readTxt();
    for (int i = 0; i < lines.length; i++) {

      // 入力されてくる文字列が1桁の場合
      if(lines[i].length() == Consts.DIGIT_ONE) {
        System.out.println(Consts.ONE_TO_TEN[this.digitOne(lines,i)]);
      }

      // 入力されてくる文字列が2桁の場合
      if(lines[i].length() == Consts.DIGIT_TWO) {
        System.out.println(Consts.ELEVEN_TO_NINETEEN[this.digitOne(lines,i)]);
      }

      // 入力されてくる文字列が3桁の場合
      if(lines[i].length() == Consts.DIGIT_THREE) {
        String result = Consts.ONE_TO_TEN[this.digitOne(lines,i)] + " " + Consts.HUNDRED;
        System.out.println(result);
      }

      // 入力されてくる文字列が4桁の場合
      if(lines[i].length() == Consts.DIGIT_FOUR) {
        String result = Consts.ONE_TO_TEN[this.digitOne(lines,i)] + " " + Consts.THOUSAND;
        System.out.println(result);
      }

      // 入力されてくる文字列が5桁の場合
      if(lines[i].length() == Consts.DIGIT_FIVE) {
        String result = Consts.ONE_TO_TEN[this.digitOne(lines,i)] + " " + Consts.MILLION;
        System.out.println(result);
      }

      // 入力されてくる文字列が6桁の場合
      if(lines[i].length() == Consts.DIGIT_SIX) {
        String result = Consts.ONE_TO_TEN[this.digitOne(lines,i)] + " " + Consts.BILLION;
        System.out.println(result);
      }
    }
    return lines;
  }


  /**
   * @param lines 入力される文字列の配列
   * @param i 配列に格納されている文字列
   * @return 配列に格納されているインデックス0の文字列
   */
  private int digitOne(String[] lines, int i) {
    return Integer.parseInt(lines[i].substring(0, 1));
  }
}
