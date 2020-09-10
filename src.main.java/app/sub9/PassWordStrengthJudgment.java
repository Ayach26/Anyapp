package app.sub9;

import app.sub9.ap.data.CheckPassWord;
import app.sub9.ap.data.InputPassWord;
import app.sub9.ap.view.OutputMessage;

/**
 * パスワードの強度判定プログラム
 *
 * 短いパスワード:8文字以下の文字列
 * 弱いパスワード:8文字以上かつ連続した文字列
 * 強いパスワード:10文字以上かつ英数字が混在した文字列
 * 最低１文字以上の英大文字が含まれていること
 * なお、パスワードに使う文字列は英数字に限定(特殊記号は不可)
 */
public class PassWordStrengthJudgment {

  public static void main(String[] args) {
    new PassWordStrengthJudgment().process();
  }

  private void process() {
    OutputMessage msg = new OutputMessage();
    msg.dialog();
    String inputValue = new InputPassWord().input();
    new CheckPassWord().checkProcess(inputValue);
  }
}