package app.test5.ap.data;

public class OutputEnglish {

  public String[] output() {
    String[] lines = new ReadNumber().readTxt();
    for (int i = 0; i < lines.length; i++) {

      // 入力されてくる文字列が1桁のみの場合
      if(lines[i].length() == Consts.DIGIT_ONE) {
        System.out.println(Consts.ONE_TO_TEN[this.digitOne(lines,i)]);
      }

      // 入力されてくる文字列が3桁かつ先頭の文字列が1の場合
      if(lines[i].length() == Consts.DIGIT_THREE) {
//        int digitOne = Integer.parseInt(lines[i].substring(0, 1));
        String result = Consts.ONE_TO_TEN[this.digitOne(lines,i)] + " " + Consts.HUNDRED;
        System.out.println(result);
      }

      // 入力されてくる文字列が4桁かつ先頭の文字列が1の場合
      if(lines[i].length() == Consts.DIGIT_FOUR) {
//        int digitOne = Integer.parseInt(lines[i].substring(0, 1));
        String result = Consts.ONE_TO_TEN[this.digitOne(lines,i)] + " " + Consts.THOUSAND;
        System.out.println(result);
      }
    }
    return lines;
  }

  private int digitOne(String[] lines, int i) {
    return Integer.parseInt(lines[i].substring(0, 1));
  }
}
