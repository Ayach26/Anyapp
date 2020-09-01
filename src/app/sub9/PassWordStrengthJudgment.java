package app.sub9;

import app.sub9.ap.data.CheckPassWord;
import app.sub9.ap.data.InputPassWord;

/**
 * パスワードの強度判定プログラム
 *
 * 短いパスワード:8文字以下
 * 弱いパスワード:8文字以上で連続した文字列
 * 強いパスワード:10文字以上で英数字が混在した文字列
 * 最低１文字以上の英大文字が含まれていること
 * なお、パスワードに使う文字列は英数字に限定(特殊記号は不可)
 */
public class PassWordStrengthJudgment {

  public static void main(String[] args) {
    new PassWordStrengthJudgment().process();
  }

  private void process() {
    System.out.println("パスワードを入力してください。");
    System.out.print("> ");
    String inputValue = new InputPassWord().input();
    new CheckPassWord().checkProcess(inputValue);
  }
}