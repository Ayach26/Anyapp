package app.test5.ap.data;

public class OutputEnglish {

  public void output() {
    String[] lines = new ReadNumber().readTxt();
    for (int i = 0; i < lines.length; i++) {
      if(lines[i].length() == Consts.DIGIT_THREE) {
        int digitOne = Integer.parseInt(lines[i].substring(0,1));
        String result = Consts.ONE_TO_TEN[digitOne] + " " + Consts.HUNDRED;
        System.out.println(result);
      }
    }
  }
}
