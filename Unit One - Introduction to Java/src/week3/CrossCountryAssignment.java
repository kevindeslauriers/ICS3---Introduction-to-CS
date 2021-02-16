package week3;

import java.util.Scanner;

public class CrossCountryAssignment {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    processRunner(in);  // runner 1
    processRunner(in);  // runner 2
    processRunner(in);  // runner 3

    in.close();
  }

  private static void processRunner(Scanner in) {
    System.out.print("Please enter runner's First Name: ");
    String fName = in.nextLine();

    System.out.print("Please enter runner's Last Name: ");
    String lName = in.nextLine();


  }

  private static String subtractTimes(String startTime, String finishTime){
    return null;
  }

  /**
   * Converts a time into a doubld (seconds) "5:34.221" => 334.221
   * 
   * @param timeString time in the format "mm:ss.sss"
   * @return converts time into seconds
   */
  private static double convertToSeconds(String timeString) {
    int colon = timeString.indexOf(":");
    int minutesAsSeconds = Integer.parseInt(timeString.substring(0,colon)) * 60;
    double seconds = Double.parseDouble(timeString.substring(colon+1));

    return minutesAsSeconds + seconds;
  }
}
