package week3;

public class MoreFunctions {
  public static void main(String[] args) {
    int number = 53273;

    int sum = getSum(number);
    System.out.println(sum);

    sum = getSumVersion2(number);
    System.out.println(sum);

    String timeString = "5:34.221";
    double timeInSeconds = convertToSeconds(timeString);
    System.out.println(timeInSeconds);

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

  /**
   * getSumVersion2 has been overloaded
   * overloaded means there is more than 1 version of the function (with that name)
   * the difference is the argument/parameter list
   * @param number
   * @return
   */
  public static int getSumVersion2(int number) {
    String numberAsString = "" + number;
    
    return getSumVersion2(numberAsString);
  }

    /**
   * getSumVersion2 has been overloaded
   * overloaded means there is more than 1 version of the function (with that name)
   * the difference is the argument/parameter list
   * @param number
   * @return
   */
  public static int getSumVersion2(String number) {

    int digit1 = Integer.parseInt(number.substring(0,1));
    int digit2 = Integer.parseInt(number.substring(1,2));
    int digit3 = Integer.parseInt(number.substring(2,3));
    int digit4 = Integer.parseInt(number.substring(3,4));
    int digit5 = Integer.parseInt(number.substring(4,5));

    return digit1 + digit2 + digit3 + digit4 + digit5;
  }

  /**
   * 
   * The method will return the sum of a 5 digit number Ex. 12346 => 13
   * 
   * @param number
   * @return the sum of the individual digits of number
   */
  public static int getSum(int number) {
    int digit1 = number / 10000;
    int digit2 = number / 1000 % 10;
    int digit3 = number / 100 % 10;
    int digit4 = number / 10 % 10;
    int digit5 = number % 10;

    return digit1 + digit2 + digit3 + digit4 + digit5;
  }
}
