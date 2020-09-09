package app.test3;

import app.test3.ap.data.InputNumber;
import app.test3.ap.view.OutputMessage;

/**
 * 数の英語表記
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