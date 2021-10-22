package app.oneweek.basic.exday4;

public class SampleEx401 {
  public static void main(String[] args) {
    CellPhone cp = new CellPhone("hoge@email.com", "090-1234-5678");
    cp.call("011-123-4567");
    cp.sendMail("fuga@mail.com");

    IPhone phone = (IPhone)cp;
    phone.call("011-987-6543");
//    phone.sendMail("foo@email.com"); IPhoneインターフェースからsendMailメソッドは利用できない

    IEmail mail = (IEmail)cp;
    mail.sendMail("bar@mail.com");
//    mail.call("011-222-3333"); IEmailインターフェースからcallメソッドは利用できない
  }
}