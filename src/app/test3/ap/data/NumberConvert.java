package app.test3.ap.data;

import java.text.DecimalFormat;

public class NumberConvert {

  private static String convertLessThanOneThousand(int number) {
    String soFar;

    if (number % Constant.TEN < Constant.TWENTY) {
      soFar = EnglishNumberSelectors.UNIQUE_NUMBER[number % Constant.ONE_HUNDRED];
      number /= Constant.ONE_HUNDRED;
    } else {
      soFar = EnglishNumberSelectors.UNIQUE_NUMBER[number % Constant.TEN];
      number /= Constant.TEN;

      soFar = EnglishNumberSelectors.UP_TO_TEN[number % Constant.TEN] + soFar;
      number /= Constant.TEN;
    }
    if (number == 0)
      return soFar;
    return EnglishNumberSelectors.UNIQUE_NUMBER[number] + " hundred" + soFar;
  }

  public static String convert(long number) {
    // 0 to 999 999 999 999
    if (number == 0) {
      return "zero";
    }

    String snumber = Long.toString(number);

    // pad with "0"
    String mask = "000000000000";
    DecimalFormat df = new DecimalFormat(mask);
    snumber = df.format(number);

    // XXXnnnnnnnnn
    int billions = Integer.parseInt(snumber.substring(0, 3));
    // nnnXXXnnnnnn
    int millions = Integer.parseInt(snumber.substring(3, 6));
    // nnnnnnXXXnnn
    int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
    // nnnnnnnnnXXX
    int thousands = Integer.parseInt(snumber.substring(9, 12));

    String tradBillions;
    switch (billions) {
    case 0:
      tradBillions = "";
      break;
    case 1:
      tradBillions = convertLessThanOneThousand(billions) + " billion ";
      break;
    default:
      tradBillions = convertLessThanOneThousand(billions) + " billion ";
    }
    String result = tradBillions;

    String tradMillions;
    switch (millions) {
    case 0:
      tradMillions = "";
      break;
    case 1:
      tradMillions = convertLessThanOneThousand(millions) + " million ";
      break;
    default:
      tradMillions = convertLessThanOneThousand(millions) + " million ";
    }
    result = result + tradMillions;

    String tradHundredThousands;
    switch (hundredThousands) {
    case 0:
      tradHundredThousands = "";
      break;
    case 1:
      tradHundredThousands = "one thousand ";
      break;
    default:
      tradHundredThousands = convertLessThanOneThousand(hundredThousands) + " thousand ";
    }
    result = result + tradHundredThousands;

    String tradThousand;
    tradThousand = convertLessThanOneThousand(thousands);
    result = result + tradThousand;

    // remove extra spaces!
    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
  }
}
