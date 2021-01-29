package week1;

public class StringConcatanationAndOperators {
  public static void main(String[] args) {
    exampleOne();
    exampleTwo();
    exampleThree();
    exampleFour();
  }

  /**
   * Remainder using the modulus operator (it is a form of division) 
   * Ususally only used with integers
   * Checks if a number is divisble by another number
   */
  private static void exampleFour() {
    int x = 11;
    
    int y = x % 2;      // % is the modulus operator it has nothing to do with percent (obtains the reminder)
                        // y - sthe remainer

    System.out.println(y);

    boolean isEven = (x % 2) == 0;          // == checks for equality (=) is assignment
                                            // boolean variables store true or false

    System.out.println(x + " is even: " + isEven);
  }

  /**
   * Review order of operations for String concatanatation
   */
  private static void exampleThree() {
    int x = 4, y = 3;

    System.out.println(x+y);
    System.out.println(x + " + " + y + " = " + x + y);           // "4 + 3 = 4" + 3 yields 4 + 3 = 43

    System.out.println(x + " + " + y + " = " + (x + y));            // BEDMAS still exists in programming/  

    System.out.println(x + y + " = " + x + " + " + y); 
  }

  /**
   * String Concatanation Example Will display something like 4+3=7
   */
  private static void exampleTwo() {
    int x = 4, y = 3, sum = x + y;                  // declared 3 different variables on a single line and assigned them values.

    // The long terrible way - this is NOT String concatanation
    System.out.print(x);
    System.out.print(" + ");
    System.out.print(y);
    System.out.print(" = ");
    System.out.println(sum);

    System.out.println(x + " + " + y + " = " + sum);

  }

  /**
   * Topics Covered:
   * constants using the modified final
   * double and int divisision
   * type casting
   */
  private static void exampleOne() {
    int markOne = 90;
    int markTwo = 94;
    int markThree = 88;

    final int NUM_TESTS = 3;   // final ensures that the value stored cannot change (IT IS CONSTANT)
    // NUM_TESTS = 6;          // Causes an error because NUM_TESTS is final (CONSTANT)

    double average = (markOne + markTwo + markThree) / NUM_TESTS;   // expected it to be 90.666667 but truncates the result to 90
                                                            // int / int yields (returns) an int (truncated)
                                                            // int / double or double / int or double / double yields a double when performing division
    System.out.println(average);

    average = (markOne + markTwo + markThree) / 3.0;          // Don't like using 3.0 because I cannot have 3.0 tests
    System.out.println(average);


    average = (double)(markOne + markTwo + markThree) / NUM_TESTS;    // casts (markOne + markTwo + markThree) as a double top complete the operation
    System.out.println(average);

    average = (markOne + markTwo + markThree) / NUM_TESTS;
    System.out.println(average);
  }
}
