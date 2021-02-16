package week4;

import java.util.Scanner;

import week3.MoreFunctions;

public class Static {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(2.3));     // static methods get called using the classname ie. Math.sqrt(2.3);
    MoreFunctions.getSum(4);    // getSum is public and static
                                // public it is visible
                                // static it is accessible through the classname

    Scanner in = new Scanner(System.in);
    in.nextLine();        // in is public and non-static (non-static gets accessed through an instance of the object - a variable that refers to a Scanner)

    String s1 = "hello";  // s1 is a reference to a String.
    s1.length();          // length() is a non-static method that we can use for a specific String (here we used it for s1.)

  }
}
