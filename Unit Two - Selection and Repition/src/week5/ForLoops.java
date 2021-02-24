package week5;

import java.util.Scanner;

public class ForLoops {
  public static void main(String[] args) {
    /*
     * Scanner in = new Scanner(System.in);
     * 
     * int x = sum(1, 10); System.out.println(x);
     * 
     * loopExampleTwo(in);
     * 
     * System.out.println("Please enter a sentence."); String sentence =
     * in.nextLine(); int numVowels = countVowelsV1(sentence);
     * System.out.println("There are " + numVowels + ".");
     * 
     * numVowels = countVowelsV2(sentence); System.out.println("There are " +
     * numVowels + ".");
     */
    // drawRectangle(6, 4, "@");
    ecoo2010(4, 3, 1, 2);
  }

  private static void ecoo2010(int m, int n, int p, int q) {
    // top of frame
    for (int j = 0; j < q; j++) {
      for (int i = 0; i < (n + 2 * p + 2 * q); i++) {
        System.out.print("#");
      }
      System.out.println();
    }

    // top of matting
    for (int i = 0; i < p; i++) {
      // left side of matting
      for (int k = 0; k < q; k++) {
        System.out.print("#");
      }
      // matting
      for (int k = 0; k < 2 * p + n; k++) {
        System.out.print("+");
      }
      // right side of matting
      for (int k = 0; k < q; k++) {
        System.out.print("#");
      }
      System.out.println();
    }

    // picture
    for (int j = 0; j < m; j++) {
      for (int k = 0; k < q; k++) {
        System.out.print("#");
      }
      // matting
      for (int k = 0; k < p; k++) {
        System.out.print("+");
      }

      // pic
      for (int k = 0; k < n; k++) {
        System.out.print(".");
      }

      // matting
      for (int k = 0; k < p; k++) {
        System.out.print("+");
      }

      for (int k = 0; k < q; k++) {
        System.out.print("#");
      }
      System.out.println();
    }

    // bottom of matting
    for (int i = 0; i < p; i++) {
      // left side of matting
      for (int k = 0; k < q; k++) {
        System.out.print("#");
      }
      // matting
      for (int k = 0; k < 2 * p + n; k++) {
        System.out.print("+");
      }
      // right side of matting
      for (int k = 0; k < q; k++) {
        System.out.print("#");
      }
      System.out.println();
    }

    // bottom of frame
    for (int j = 0; j < q; j++) {
      for (int i = 0; i < (n + 2 * p + 2 * q); i++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }

  /**
   * 4,6,"*"
   * 
   * 
   * 
   * @param width
   * @param height
   * @param symbol
   */
  private static void drawRectangle(int width, int height, String symbol) {
    // display width symbols - one row
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        System.out.print(symbol);
      }
      System.out.println();
    }
  }

  private static int countVowelsV2(String sentence) {
    int numVowels = 0;

    for (int index = 0; index < sentence.length(); index++) {
      String letter = sentence.substring(index, index + 1);
      // checks if letter is in the string "AEIOU" OR "aeiou"
      if ("AEIOUaeiou".indexOf(letter) >= 0) {
        numVowels++;
      }

    }
    return numVowels;
  }

  private static int countVowelsV1(String sentence) {
    int numVowels = 0;

    for (int index = 0; index < sentence.length(); index++) {
      String letter = sentence.substring(index, index + 1);
      if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")
          || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
        numVowels++;
      }

    }
    return numVowels;
  }

  private static void loopExampleTwo(Scanner in) {
    String mysteryColour = "red";
    String colour = null;

    for (; colour == null || !colour.equalsIgnoreCase(mysteryColour);) {
      System.out.print("What is the mystery colour? ");
      colour = in.nextLine();
    }

    System.out.println("Yeah!!! I like the colour " + mysteryColour + ".");
  }

  /**
   * returns the sum of the numbers from start to end (inclusive)
   * 
   * @param start
   * @param end
   * @return the sum of the numbers from start to end
   */
  private static int sum(int start, int end) {
    int result = 0;

    // for loop has 3 parts (initialize the counter, condition, how we are counting)
    for (int i = start; i <= end; i++) {
      result += i;
    }

    return result;
  }

}
