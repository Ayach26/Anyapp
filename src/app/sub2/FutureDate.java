package app.sub2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 現在の日付から指定された日数経過後の
 * 日付の出力をします。
 */
public class FutureDate {

   /** 経過日数 */
  public static final int PASSAGE_DAY = 100;

  public static void main(String args[]) {
    Date nowDate = new Date();
    Calendar calender = Calendar.getInstance();

    calender.setTime(nowDate);

    int day = calender.get(Calendar.DAY_OF_MONTH);

    day += PASSAGE_DAY;
    calender.set(Calendar.DAY_OF_MONTH,day);

    Date future = calender.getTime();

    SimpleDateFormat format = new SimpleDateFormat("西暦yyyy年MM日dd日");
    System.out.println(format.format(future));
  }
}
