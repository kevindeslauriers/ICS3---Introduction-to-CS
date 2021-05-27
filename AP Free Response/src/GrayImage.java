public class GrayImage {
  public static final int BLACK = 0;
  public static final int WHITE = 255;

  private int[][] pixelValues;

  public int countWhitePixels() {
    int result = 0;
    for (int i = 0; i < pixelValues.length; i++) {
      for (int j = 0; j < pixelValues[i].length; j++) {
        if (pixelValues[i][j] == WHITE)
          result++;
      }
    }

    return result;
  }

  public void processImage() {
    for (int i = 0; i < pixelValues.length; i++) {
      for (int j = 0; j < pixelValues[i].length; j++) {
        if ((i + 2 < pixelValues.length) && (j + 2 < pixelValues[i].length)) {
          pixelValues[i][j] -= pixelValues[i + 2][j + 2];
          if (pixelValues[i][j] < BLACK)
            pixelValues[i][j] = BLACK;
        }
      }
    }
  }
}
