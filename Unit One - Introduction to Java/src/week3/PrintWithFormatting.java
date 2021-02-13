package week3;

/**
 * We can format our numbers so that they take a specific width of the screen.
 * We can also specify the number of decimal places we want.
 * Lastly, we can pad numbers with zeros (on the left)
 * 
 * This is all done using String.format() which takes a string containing placeholders (%d and %f)
 * Watch the video in Teams for a full description on how it works.
 */
public class PrintWithFormatting {
  public static void main(String[] args) {
    // 11:25.393

    // 5:06.270
    // 5:6.27
    // 5:6.2900000000003

    int minutes = 5;
    double seconds = 6.27;

    String timeFormatted = String.format("%d:%06.3f", minutes,  seconds); 
    System.out.println(timeFormatted);  // 5:06.270


    double money = 6.2;
    System.out.println(String.format("$%4.2f", money)); 

  }
}
