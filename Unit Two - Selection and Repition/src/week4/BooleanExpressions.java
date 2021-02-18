package week4;

import java.util.Scanner;

public class BooleanExpressions {
  public static void main(String[] args) {
    primitiveBooleans();
    compoundBooleanExpressions();
  }

  private static void compoundBooleanExpressions() {
    
  // && => and
  // || => or
  // ! => not

  Scanner in = new Scanner(System.in);
  System.out.print("Please enter a colour for the shoes: ");
  String colour = null;//in.nextLine();//.toLowerCase();

  System.out.print("How many shoes? ");
  int numShoes = Integer.parseInt(in.nextLine());

  // are there at least 4 pairs of red shoes?
  System.out.println(colour != null && colour.equalsIgnoreCase("red") && (numShoes >= 4));

  // are there at least 4 pairs of shoes OR the shoes are blue?
  System.out.println(colour != null && colour.equalsIgnoreCase("blue") || (numShoes >= 4));

  /** short circuit expressions
   *
   * colour.equalsIgnoreCase("red") && (numShoes >= 4)
   * If the colour is not red there is no way both expression can be true and as a result Java does not look at the numShoes expression
   * 
   * 
   * colour.equalsIgnoreCase("blue") || (numShoes >= 4)
   * If the colour is blue then we don't to look at numShoes expression BECAUSE only 1 of the expressions has to be true for OR
   *  
  */

  boolean isResult = false;
  System.out.println(isResult);   // prints false

  System.out.println(!isResult); // prints true because !false => NOT false => true
    

  }

  private static void primitiveBooleans() {
    boolean isYellow = true;      // boolean primitives are either true or false
    boolean hasDog = false;       // naming convention: we normally use is or has to prefix the variable name.


    boolean isTrue = (7 + 3) == 10;     //  == is the equality operator and is used to check if two operands are equal
                                        // left operand => (7+3)
                                        // operator => ==
                                        // right operand => 10
                                        // this example evaluates to true

                                        
     System.out.println(7 != 7);        // != is used for not equal   7 != 7 is false          
     
     System.out.println(7 > 7);         // 7 > 7 is false

     System.out.println(7 <= 7);        // 7 <= 7 is true

  }
}
