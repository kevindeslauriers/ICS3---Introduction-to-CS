public class RouteCipher {
  private String[][] letterBlock;

  private int numRows;
  private int numCols;

  private void fillBlock(String str) {
    int counter = 0;
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        if (str.length() > counter) { // make sure counter is a valid index in str
          letterBlock[row][col] = str.substring(counter, counter + 1);
          counter++;
        } else {
          letterBlock[row][col] = "A";
        }
      }
    }
  }

  private String encryptBlock() {
    /* implementation not shown */
    return "";
  }

  public String encryptMessage(String message) {
    int spaces = numRows * numCols;
    int num = message.length() / spaces;
    if (message.length() % spaces != 0)
      num++;

    String result = "";
    for (int i = 0; i < num; i++) {
      if (i < num - 1)
        fillBlock(message.substring(i * spaces, i * spaces + spaces));
      else
        fillBlock(message.substring(i * spaces));

      result += encryptBlock();
    }

    return result;
  }
}
