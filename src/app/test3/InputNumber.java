package app.test3;

import java.util.ArrayList;
import java.util.Scanner;

import app.test3.ap.view.OutputMessage;

public class InputNumber {

  OutputMessage msg = new OutputMessage();

  public ArrayList<String> input() {
    msg.dialog();
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> numberList = new ArrayList<>();
    msg.inputSignal();
    while (scanner.hasNext()) {
      msg.inputSignal();
      numberList.add(scanner.nextLine());
    }
    return numberList;
  }

  private void output(ArrayList<String> numberList) {
    for(int i = 0; i < numberList.size(); i++) {
      System.out.println(numberList.get(i));
    }
  }
}
