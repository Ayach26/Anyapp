package app.test3;

import app.test3.ap.data.InputNumber;
import app.test3.ap.view.OutputMessage;

/**
 * 数の英語表記
 *
 * 0から1000兆まで英語表記にする
 * 0から99までの英語の数字の数え方には規則性がある
 *
 * 100以上：one hundred
 * 1000以上：one thousand
 * 10,000以上：ten thousand 10,000以上は、千の位ごと読む
 * 1,000,000以上：one million
 * 1,000,000,000:one billion
 * 1,000,000,000,000:one trillion
 *
 */
public class NumberOfEnglish {

  private final OutputMessage msg = new OutputMessage();

  public static void main(String[] args) {
    new NumberOfEnglish().process();
  }

  private void process() {
    msg.startMessage();
    msg.dialog();
    new InputNumber().output();
  }
}