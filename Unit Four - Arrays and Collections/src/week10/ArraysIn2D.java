package week10;

public class ArraysIn2D {
  private static final int NUM_ROWS = 5;
  private static final int NUM_COLS = 3;

  public static void main(String[] args) {

    int[][] arr2D = new int[NUM_ROWS][];

    for (int r = 0; r < NUM_ROWS; r++) {
      int numCols = (int) (Math.random() * 5) + 1;
      arr2D[r] = new int[numCols];
      for (int c = 0; c < arr2D[r].length; c++) {
        arr2D[r][c] = (int) (Math.random() * 10) + 1;
      }
    }

    int numEven = countEven(arr2D);
  }

  /**
   * Take the length of a 2D array and it gives you the number of rows
   * 
   * @param arr2D
   * @return
   */
  private static int countEven(int[][] arr2D) {

    int result = 0;
    /*
     * for (int r = 0; r < arr2D.length; r++) { for (int c = 0; c < arr2D[r].length;
     * c++) { if (arr2D[r][c] % 2 == 0) result++; } }
     */
    for (int[] row : arr2D) {
      for (int el : row) {
        if (el % 2 == 0)
          result++;
      }
    }

    return result;
  }
}
