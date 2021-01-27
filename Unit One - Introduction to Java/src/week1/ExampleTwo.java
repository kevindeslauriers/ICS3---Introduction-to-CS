package week1;

/**
 * This example is going to cover Escape Sequences
 */
public class ExampleTwo {
  public static void main(String[] args) {
    System.out.println("This is very \"exciting\" code!");    // " identifies the beginning and end of a String literal - text you want to include in the code
                                                              // backslash \ identfies an escape sequence it creates a special character

    //System.out.println("This \is an error.");                // we can only escapse certain characters (AP escape sequences are \n \" \\)                                         

    System.out.println("This\nis\na\nvalid\nescape\nnsequence.\n");
  }
    


}