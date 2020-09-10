package app.test3.ap.data;

import java.util.ArrayList;
import java.util.Scanner;

import app.test3.ap.view.OutputMessage;

public class InputNumber {

  private ArrayList<String> input() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> numberList = new ArrayList<>();
    numberList.add(scanner.nextLine());
    return numberList;
  }

  public void output() {
    ArrayList<String> numberList = this.input();
    for (int i = 0; i < numberList.size(); i++) {
      System.out.println(numberList.get(i));
    }
  }
}
