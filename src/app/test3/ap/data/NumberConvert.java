package app.test3.ap.data;

import java.util.Random;

public class NumberConvert {

  private final String[] uniqueNum = EnglishNumberSelectors.UNIQUE_NUMBER;

  private final String[] upToTen = EnglishNumberSelectors.UP_TO_TEN;

  public String convert(final int n) {
    if (n < 0) {
      return "minus " + convert(-n);
    }

    if (n < 20) {
      return uniqueNum[n];
    }

    if (n < 100) {
      return upToTen[n / 10] + ((n % 10 != 0) ? " " : "") + uniqueNum[n % 10];
    }

    if (n < 1000) {
      return uniqueNum[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
    }

    if (n < 1000000) {
      return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
    }

    if (n < 1000000000) {
      return convert(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
    }

    return convert(n / 1000000000) + " billion" + ((n % 1000000000 != 0) ? " " : "") + convert(n % 1000000000);
  }

  public void output() {
    final Random generator = new Random();

    int n;
    for (int i = 0; i < 20; i++) {
      n = generator.nextInt(Integer.MAX_VALUE);

      System.out.printf("%10d = '%s'%n", n, convert(n));
    }

    n = 1000;
    System.out.printf("%10d = '%s'%n", n, convert(n));

    n = 2000;
    System.out.printf("%10d = '%s'%n", n, convert(n));

    n = 10000;
    System.out.printf("%10d = '%s'%n", n, convert(n));

    n = 11000;
    System.out.printf("%10d = '%s'%n", n, convert(n));

    n = 999999999;
    System.out.printf("%10d = '%s'%n", n, convert(n));

    n = Integer.MAX_VALUE;
    System.out.printf("%10d = '%s'%n", n, convert(n));
  }
}
