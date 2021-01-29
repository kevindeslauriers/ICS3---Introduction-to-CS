package week1;

public class UsingBuiltInFunctions {
  public static void main(String[] args) {
    exampleOne();
    exampleTwo();

    // pass in two ints and find a random number between those two numbers inclusice
    // first number is smaller than second number
    displayRandomNumber(6, 12);
  }

  /**
   * General method for obtaining a random number between lower and upper inclusive
   * @param lower lower bound - smallest number to return
   * @param upper upper bound - largest number to return
   */
  private static void displayRandomNumber(int lower, int upper) {
    int randomNumber;
    
    for(int i = 0; i<100; i++){
      randomNumber = (int)(Math.random() * (upper-lower+1)) + lower;
      System.out.println(randomNumber);
    }

  }

  /**
   * Generating random numbers
   */
  private static void exampleTwo() {
    double randomNumber = Math.random();      // returns a number 0.0 <= x < 1.0
    //System.out.println(randomNumber);   // ex: 0.7919971175599081 or 0.570026695644729

    // Goal is to get a random integer between 1 and 10
    //for(int i = 0; i<100; i++){
    //  randomNumber = Math.random() * 10;      // multiplies every possible numeber by 10  
    //  System.out.println(randomNumber);       // smallest is 0.0 * 10 = 0.0
    //}                                         // largest is 0.9999999999999 * 10 = 9.99999999999999

    for(int i = 0; i<100; i++){
      int randomNumber2 = (int)(Math.random() * 10) + 1;      // multiplies every possible numeber by 10 and casts as an int
      System.out.println(randomNumber2);       // smallest is 1
    }                                         // largest is 10

  }

  private static void exampleOne() {
    double x = 2.0;

    double y = Math.sqrt(x);
    System.out.println(y);

    double z = Math.pow(x, 2);    // returns x to the power of 2 (x squared)
    System.out.println(z);
  }
}
