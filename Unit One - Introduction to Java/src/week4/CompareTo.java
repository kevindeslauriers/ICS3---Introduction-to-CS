package week4;

public class CompareTo {
  public static void main(String[] args) {
    String s1 = "hello";    // String literal
    String s2 = "goodbye";
    String s3 = new String("hello");  // reference to a String
    String s4 = "hello";    // String literal
    String s5 = "zoo";
    String s6 = "zzo";
    String s7 = "zzoB";


    // Review of equals method
    System.out.println(s1.equals(s2));    // equals checks if s1 and s2 have the same sequence of characters
    System.out.println(s1.equals(s3));
    System.out.println(s1 == s3);         // == check if the share the same reference (No they do not)
    System.out.println(s1 == s4);         // == check if the share the same reference (Yes they do - String Literals)


    System.out.println(s1.compareTo(s3)); // two string that are equals will return 0
    System.out.println(s1.compareTo(s2)); // hello > goodbye because 'h' > 'g' in the ASCII table
    System.out.println(s1.compareTo(s5)); // hello < zoo because 'h' < 'z' in the ASCII table h (104), z (122)
    System.out.println(s5.compareTo(s1));
    System.out.println(s5.compareTo(s6));
    System.out.println(s6.compareTo(s7));


  }
}
