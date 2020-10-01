package app.Chapter2;

public class MultiArray {

  void array() {
    int[][] array;
    array = new int[3][4];
//    int[][] array = new int[3][4];

    array[0][0] = 100;
    array[0][3] = 200;

    System.out.println("[0][0]の値：" + array[0][0]);
    System.out.println("[0][3]の値：" + array[0][3]);

    int[][] array2 = {
        { 10, 20, 30, 40 },
        { 50, 60, 70, 80 },
        { 100, 200, 300, 400 }
    };

    System.out.println("[0][0]の値：" + array2[0][0]);
    System.out.println("[0][3]の値：" + array2[0][3]);

//    int[][] array3 = new int[3][];
//    array[0] = new int[3];
//    array[0] = new int[5];
//    array[0] = new int[2];

    int[][] array3 = {
      { 10, 20, 30},
      { 50, 60, 70, 80, 90},
      { 100, 200}
    };

    System.out.println("[0][0]の値：" + array3[0][0]);
    System.out.println("[1][4]の値：" + array3[1][4]);
  }
}
