package week3;

public class WritingFunctions {
  public static void main(String[] args) {
    // The purpose of a function is to encapsulate or to abstract logic and place it into a method/function
    // function/method performs a specific tasl (and can return a value)
    int x = 7;
    int y = 8;

    int z = sum(x, y);

    addOne(x);
    double x1, y1, x2, y2;

    x1 = 4;
    x2 = 7;
    y1 = -2;
    y2 = 6;
    double slope = getSlope(x1, y1, x2, y2);
   
    System.out.println(slope);

    double questionOne  = getTotalCost(100, 8.0);
  }

  private static double getTotalCost(int price, double tax) {
    return price + price * tax / 100;
  }

  /**
   * Calculates the slope of two points (x,y)
   * 
   * @param x1 - x coordinate for point 1
   * @param y1 - y coordinate for point 1
   * @param x2 - x coordinate for point 2
   * @param y2 - y coordinate for point 2
   * @return the slope of the two points
   */
  private static double getSlope(double x1, double y1, double x2, double y2) {
    return (y2 - y1) / (x2 - x1);
  }

  private static int sum(int num1, int num2) {
    int result = num1 + num2;

    return result;
  }

  /**
   * num1 is a copy of x and any changes to num1 do not affect x because the params are primitive
   */
  private static void addOne(int num1){
    num1++;       // ++ adds 1    -- subtracts 1               
  }
}
