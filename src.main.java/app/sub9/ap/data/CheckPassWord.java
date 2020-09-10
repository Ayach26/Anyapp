package app.sub9.ap.data;

import java.util.regex.Pattern;

import app.sub9.ap.view.OutputMessage;

/**
 * 入力されたパスワードの強度判定クラス
 */
public class CheckPassWord {

  /** パスワード最小文字数 */
  private static final int MIN_LENGTH = 8;
  /** パスワード推奨文字数 */
  private static final int STRONG_LENGTH = 10;
  /** 英大文字 */
  private static final String UPPER_CASE = "(.*[A-Z].*)";
  /** 数字 */
  private static final String NUMBER = "(.*[0-9].*)";
  /** コンパイル済みのスペース */
  private static final Pattern SPACE = Pattern.compile("(.*[ ].*)");
  /** コンパイル済みの記号 */
  private static final Pattern SYMBOL = Pattern.compile("(.*[ ! # @ $ %^& * () - _ = + [ ] ; : ' \" , <.>/?].*)");

  OutputMessage msg = new OutputMessage();

  public void checkProcess(String password) {
    this.isSpaceContain(password);
    this.isSymbolContain(password);
    this.isUpperCasePass(password);
    this.isNumberPass(password);
    this.isShortPass(password);
    this.isStrongPass(password);
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

  //以下3パターンの結果はどこかへ移植すべきか

  /**
   * 8文字以下であることを判定する。
   * @param password 入力されたパスワード
   * @return 8文字以上であればtrue
   */
  private boolean isShortPass(String password) {
    if(password.length() <= MIN_LENGTH) {
      msg.resultShortPass();
    }
    return true;
  }

  /**
   * 8文字以上かつ連続した文字列であることを判定する。
   * @param password 入力されたパスワード
   * @return 8文字以上かつ連続した文字列であればtrue
   */
  private boolean isWeakPass(String password) {
    // TODO 連続した文字列であることを確認する処理を以下に追加する
    if(isShortPass(password)) {
      msg.resultWeakPass();
    }
    return true;
  }

  /**
   * 10文字以上かつ英数字が混在した文字列であることを判定する。
   * @param password 入力されたパスワード
   * @return 10文字以上かつ英数字が混在した文字列であればtrue
   */
  private boolean isStrongPass(String password) {
    if(password.length() >= STRONG_LENGTH) {
      msg.resultStrongPass();
    }
    return true;
  }
}
