package app.oneweek.basic.exday4;

public class CellPhone implements IPhone, IEmail {
  private String maiiAddress;

  private String number;

  public CellPhone(String mailAddless, String number) {
    this.maiiAddress = mailAddless;
    this.number = number;
  }

  public void sendMail(String addless) {
    System.out.println(addless + "に、" + this.maiiAddress + "からメールを送ります。");
  }

  public void call(String number) {
    System.out.println(number + "に、" + this.number + "から電話をかけます。");
  }
}