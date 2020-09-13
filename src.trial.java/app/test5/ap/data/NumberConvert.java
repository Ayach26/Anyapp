package app.test5.ap.data;

public class NumberConvert {
  String[] NumberList = new OutputEnglish().output();

  String[] CheckLength(int i) {

    if(i == Consts.DIGIT_ONE) {
      System.out.println("ぜろ");
    }

    if(NumberList[i].length() == Consts.DIGIT_ONE) {
      System.out.println(Consts.ONE_TO_TEN[i]);
    }

    if(NumberList[i].length() == Consts.DIGIT_THREE) {
      int digitOne = Integer.parseInt(NumberList[i].substring(0, 1));
      String result = Consts.ONE_TO_TEN[digitOne] + " " + Consts.HUNDRED;
      System.out.println(result);
    }
    return NumberList;
  }
}
