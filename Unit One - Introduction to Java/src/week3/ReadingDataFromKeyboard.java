package week3;

import java.util.Scanner;

public class ReadingDataFromKeyboard {
  public static void main(String[] args) {
    exampleOne();
    exampleTwo();
    exampleThree();
  }

  private static void exampleTwo() {
    Scanner in = new Scanner(System.in);  
    System.out.print("Please enter a 5 digit integer: ");
    int number = Integer.parseInt(in.nextLine());
    int sum = MoreFunctions.getSum(number);
    System.out.println(sum);

    in.close();
  }

  private static void exampleThree() {
    Scanner in = new Scanner(System.in);  
    System.out.print("Please enter a 5 digit integer: ");
    String number = in.nextLine();
    int sum = MoreFunctions.getSumVersion2(number);
    System.out.println(sum);

    in.close();
  }

  private static void exampleOne() {
    Scanner in = new Scanner(System.in);  // System.in is the default input device (keyboard)
    System.out.print("Please enter your favourite colour: ");
    String favouriteColour = in.nextLine();
    System.out.println(favouriteColour);
    in.close();
  }
}
