package week5;

import java.util.Scanner;

public class WhileLoops {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = sum(1, 10);
    System.out.println(x);

    loopExampleTwo(in);

    System.out.println("Please enter a sentence.");
    String sentence = in.nextLine();
    int numVowels = countVowelsV1(sentence);
    System.out.println("There are " + numVowels + ".");

    numVowels = countVowelsV2(sentence);
    System.out.println("There are " + numVowels + ".");
  }

  private static int countVowelsV2(String text) {
    int numVowels = 0;
    int index = 0;

    while (index < text.length()) {
      String letter = text.substring(index, index + 1);
      // checks if letter is in the string "AEIOU" OR "aeiou"
      if ("AEIOUaeiou".indexOf(letter) >= 0) {
        numVowels++;
      }
      index++;

    }
    return numVowels;
  }

  /**
   * Iterates through the text and check for AEIOU
   * 
   * @param text
   * @return
   */
  private static int countVowelsV1(String text) {
    int numVowels = 0;
    int index = 0;

    while (index < text.length()) {
      String letter = text.substring(index, index + 1);
      if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")
          || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
        numVowels++;
      }
      index++;

    }
    return numVowels;

  }

  private static void loopExampleTwo(Scanner in) {
    String mysteryColour = "red";
    String colour = null;

    while (colour == null || !colour.equalsIgnoreCase(mysteryColour)) {
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
    /**
     * loops allows us to repeat code repetition / iteration (using through an array
     * or collection) We can iterate through the characters of a String
     */

    /**
     * while(boolean expression){ // as long as the boolean expression evaluates to
     * true it will enter the body of the loop
     * 
     * }
     * 
     * Need to ensure there is a way to make the boolean expression false or we have
     * an infinite loop
     */

    int result = 0;
    int i = start;

    while (i <= end) {
      result += i;
      i++; // updates the counter (eventually i > end and the loop will stop)
    }

    return result;
  }
}
