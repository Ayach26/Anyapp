package app.sub9.ap.view;

public class OutputMessage {

  public void dialog() {
    System.out.println("パスワードを入力してください。");
    System.out.print("> ");
  }

  public void resultShortPass() {
    System.out.println("パスワードが短いです。");
  }

  public void resultUpperCasePass() {
    System.out.println("パスワードには最低１文字以上の英大文字を含んでください。");
  }

  public void resultNumber() {
    System.out.println("パスワードには最低１文字以上の数字を含んでください。");
  }

  public void resultContainSpace() {
    System.out.println("パスワードにはスペースを含まないでください。");
  }

  public void resultContainSymbol() {
    System.out.println("パスワードには記号を含まないでください。");
  }
}
