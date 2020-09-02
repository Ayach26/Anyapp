package app.sub9.ap.data;

import java.util.regex.Pattern;

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
  /** コンパイル済みの全角スペース */
  private static final Pattern SPACE = Pattern.compile("(.*[ ].*)");
  /** コンパイル済みの全角記号 */
  private static final Pattern SYMBOL = Pattern.compile("/(.*[!,%,&,@,#,$,^,*,?,_,~].*[!,%,&,@,#,$,^,*,?,_,~])/");
//  "(.*[ ! # @ $ %^& * () - _ = + [ ] ; : ' \" , <.>/?].*)"
  /** 英数字 */
//private static final String ALPHANUMERIC = "^[0-9a-zA-Z]+$";

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
   * @return 8文字以上であればtrue
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
   * @return 英大文字が含まれていればtrue
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
   * @return 数字が含まれていればtrue
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
   * @return スペースが含まれていなければtrue
   */
  private boolean isSpaceContain(String password) {
    if(SPACE.matcher(password).find()) {
      msg.resultContainSpace();
    }
    return true;
  }

  /**
   * 記号が含まれていないことを判定する。
   * @param password 入力されたパスワード
   * @return 記号が含まれていなければtrue
   */
  private boolean isSymbolContain(String password) {
    if(SYMBOL.matcher(password).find()) {
      msg.resultContainSymbol();
    }
    return true;
  }
}
