package week8;

public class ArrayExamplesPrimitives {
  public static void main(String[] args) {
    exampleOne();
    exampleTwo();

  }

  private static void exampleTwo() {
    int[] nums = { 7, 2, 27, -98, 113 };

    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    System.out.println(sum);

    sum = 0;
    for (int num : nums) {
      sum += num;
      num++;
      System.out.println();
    }
    System.out.println(sum);

  }

  /**
   * CodingBat Arrays 2
   * 
   * Return the sum of the numbers in the array, returning 0 for an empty array.
   * Except the number 13 is very unlucky, so it does not count and numbers that
   * come immediately after a 13 also do not count.
   * 
   * @param nums
   * @return
   */
  public int sum13(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 13)
        sum += nums[i];
      else
        i++; // skip the next number
    }

    return sum;
  }

  /**
   * Declare an array of primitive ints Access the elements in the array of ints
   */
  private static void exampleOne() {
    int[] numbers = new int[5]; // 1. we have declared a reference to an in array.
                                // 2. assigned the the variable to an int array of size/length 5

    /**
     * Arrays have NO methods it is not a class
     */

    numbers[0] = 7;
    numbers[1] = 2;
    numbers[2] = 12;
    numbers[3] = -87;

    // length is a property of arrays which identifies the number of elements if can
    // hold.
    System.out.println("The length (size) of the array is: " + numbers.length);

  }
}
