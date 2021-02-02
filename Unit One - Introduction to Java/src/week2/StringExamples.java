package week2;

public class StringExamples {
  public static void main(String[] args) {
    exampleOne();
    exampleTwo();
    exampleThree();
  }

  /**
   * Comparison of Reference and Primitive data types.
   * There is a big difference between how these types are stored and represesnted in memory.
   */
  private static void exampleOne() {
    String simpleText = "This is a String.";
    int number = 7;
    
    System.out.println(simpleText);
    System.out.println(number);
  }

  /**
   * Review of the String methods that the AP Exam will test you on.
   * In addition to these methods (including the Constructor - see ex 3) are equals and compareTo which are in other examples.
   */
  private static void exampleTwo() {
    String courseCode = "ICS3U AP3U";
    int x = courseCode.length();
    System.out.println("The length of \"" + courseCode + "\" is: " + x);

    String sub = courseCode.substring(2, 5);  // "SCU" (starts at index 2 and ends at index 4) [2,5)     2 <= x < 5
    System.out.println(sub);  // displays "SCU"

    String sub2 = courseCode.substring(2);  // "SCU AP"  the paramater refers to the starting index. The substring will begin at 2 and go to the end.
    System.out.println(sub2);  // displays "SCU AP"

    int index = courseCode.indexOf("3U");   // returns the index of the first occurence of "3U" in courseCode
    System.out.println("The index of the first occurence of \"3U\" in the String \"" + courseCode + "\" is: " + index);

    index = courseCode.indexOf("blah");   // this returns -1 because "blah" is not located in the String "ICS3U AP3U"
    System.out.println("The index of the first occurence of \"blah\" in the String \"" + courseCode + "\" is: " + index);

  }

  /**
   * The equals methods of the String class compares the sequence of characters
   * Always use the equals methods instead of the == operator
   */
  private static void exampleThree() {
    String s1 = new String("Steve");    // going to build a new String EVERYTIME
    String s2 = new String("Steve");
    String s3 = "Steve";    // if you declare a String like we did for s3 or s4 using String a = "blah blah" (we don't use the constructor) it reuses the existing Steve if itis already there.
    String s4 = "Steve";    // String literal - Java stores all the String literals in a table and reuses them 


    //System.out.println(s1 == s2);     // == equality operator  = assignmwent operator (never use == to compare strings)
    //System.out.println(s1 == s3);

    //System.out.println(s1.equals(s2));  // check if 2 strings are equal then use the equals method!!!!
    System.out.println(s3 == s4);   // using == to compare String literals returns true.
  }
}
