package app.sub9.ap.data;

import app.sub9.ap.view.OutputMessage;

/**
 * 入力されたパスワードの強度判定クラス
 */
public class CheckPassWord {

  /** パスワード最小文字数 */
  private static final int MIN_LENGTH = 8;
  /** 英大文字 */
  private static final String UPPER_CASE = "(.*[A-Z].*)";
  /** 数字 */
  private static final String NUMBER = "(.*[0-9].*)";

  OutputMessage msg = new OutputMessage();

  public void checkProcess(String password) {
    this.isShortPass(password);
    this.isUpperCasePass(password);
    this.isNumberPass(password);
  }

  private boolean isShortPass(String password) {
    if(password.length() < MIN_LENGTH) {
      msg.resultShortPass();
    }
    return false;
  }

  private boolean isUpperCasePass(String password) {
    if(!password.matches(UPPER_CASE)) {
      msg.resultUpperCasePass();
    }
    return false;
  }

  private boolean isNumberPass(String password) {
    if(!password.matches(NUMBER)) {
      msg.resultNumber();
    }
    return false;
  }
}
