package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangmanPractice {
  public static void main(String[] args) {
    readFromFile();
    getInputFromUser();
  }

  /**
   * Read a number from the keyboard and square it
   */
  private static void getInputFromUser() {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter a number: ");
    String numberAsText = in.nextLine();
    boolean validInput = false;
    while (!validInput) {
      try {
        int number = Integer.parseInt(numberAsText);
        validInput = true;
        System.out.println(Math.pow(number, 2));
      } catch (NumberFormatException ex) {
        System.out.print("Please enter a number: ");
        numberAsText = in.nextLine();
      }
    }
    in.close();
  }

  private static void readFromFile() {
    try {
      Scanner in = new Scanner(new File("src\\week5\\clues.dat"));
      while (in.hasNextLine()) {
        String text = in.nextLine();
        System.out.println(text);
      }
      in.close();
    } catch (FileNotFoundException e) {
      System.out.println("Could not locate the file.");
      System.exit(0);
    }

  }
}
