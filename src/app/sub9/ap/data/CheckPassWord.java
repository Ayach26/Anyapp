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
  /** 全角スペース */
  private static final String SPACE = "(.*[ ].*)";
  /** 全角記号 */
  private static final String SYMBOL = "(.*[ ! # @ $ %^& * () - _ = + [ ] ; : ' \" , <.>/?].*)";

  OutputMessage msg = new OutputMessage();

  public void checkProcess(String password) {
    this.isPassLength(password);
    this.isUpperCasePass(password);
    this.isNumberPass(password);
    this.isSpaceContain(password);
    this.isSymbolContain(password);
  }

  /**
   * パスワードが8文字以上であることを判定する。
   * @param password 入力されたパスワード
   * @return 8文字以上であればtrue、8文字以下はfalse
   */
  private boolean isPassLength(String password) {
    if(password.length() < MIN_LENGTH) {
      msg.resultShortPass();
    }
    return true;
  }

  /**
   * 英大文字が含まれていることを判定する。
   * @param password 入力されたパスワード
   * @return
   */
  private boolean isUpperCasePass(String password) {
    if(!password.matches(UPPER_CASE)) {
      msg.resultUpperCasePass();
    }
    return true;
  }

  /**
   * 数字が含まれていることを判定する。
   * @param password 入力されたパスワード
   * @return
   */
  private boolean isNumberPass(String password) {
    if(!password.matches(NUMBER)) {
      msg.resultNumber();
    }
    return true;
  }

  /**
   * スペースが含まれていないことを判定する。
   * @param password 入力されたパスワード
   * @return
   */
  private boolean isSpaceContain(String password) {
    if(!password.matches(SPACE)) {
      msg.resultContainSpace();
    }
    return true;
  }

  /**
   * 記号が含まれていないことを判定する。
   * @param password 入力されたパスワード
   * @return
   */
  private boolean isSymbolContain(String password) {
    if(!password.matches(SYMBOL)) {
      msg.resultContainSymbol();
    }
    return true;
  }
}
