package src;

public class TwoDimensionalArrays {
  public static void main(String[] args) {
    int[][] array2D = { { 11, 222, 333 }, { 22, 354, 66 } };

    for (int i = 0; i < array2D.length; i++) {
      for (int j = 0; j < array2D[i].length; j++) {
        System.out.println("The value is " + array2D[i][j]);
      }
    }
  }
}
