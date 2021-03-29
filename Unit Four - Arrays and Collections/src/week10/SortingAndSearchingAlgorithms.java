package week10;

public class SortingAndSearchingAlgorithms {
  public static void main(String[] args) {
    int nums[] = { 10, 2, 18, -4, 12, 33, 9 };

    selectionSort(nums);
    // display(nums);

    int nums1[] = { 12, 21, -18, -4, 2, 13, 9 };
    insertionSort(nums1);
    // display(nums1);

    int arr[] = merge(nums, nums1);
    display(arr);
  }

  /**
   * 
   * @param nums  a sorted array
   * @param nums1 a sorted array
   * @return a sorted array with all of the elements from nums and nums2
   */
  private static int[] merge(int[] nums, int[] nums1) {
    int arr[] = new int[nums.length + nums1.length];
    int i = 0;
    int j = 0;

    for (int k = 0; k < arr.length; k++) {
      // check if we have NOT reached the end of both arrays
      if (i < nums.length && j < nums1.length) {
        if (nums[i] < nums[j]) {
          arr[k] = nums[i];
          i++;
        } else {
          arr[k] = nums1[j];
          j++;
        }
        // checks if we have stuff left in the 1st array
      } else if (i < nums.length) {
        arr[k] = nums[i];
        i++;
        // we have stuff left only in the 2nd array
      } else {
        arr[k] = nums1[j];
        j++;
      }
    }

    return arr;
  }

  private static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i - 1;
      while (j >= 0 && temp < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = temp;
    }

  }

  private static void display(int[] nums) {
    for (int x : nums) {
      System.out.println(x);
    }
  }

  private static void selectionSort(int[] nums) {
    // outter loop is responsible for the division between
    // the sorted and unsorted side
    for (int i = 0; i < nums.length - 1; i++) {
      int minIndex = i;
      // inner loop is responsible for locating the smalled element
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[minIndex])
          minIndex = j;
      }

      int temp = nums[i];
      nums[i] = nums[minIndex];
      nums[minIndex] = temp;
    }
  }

}
