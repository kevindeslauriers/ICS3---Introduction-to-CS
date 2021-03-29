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
    // display(arr);

    int[] arr2 = createRandomArray(20);
    // display(arr2);

    // System.out.println("\n\n-----------------\n" + sequentialSearch(arr2, 5));

    selectionSort(arr2);
    // System.out.println("\n\n-----------------\n" + binarySearch(arr2, 5));

    int[] arr3 = createRandomArray(20);
    display(arr3);
    selectionSort(arr3);
    System.out.println("\n\n-----------------\n" + binarySearch(arr3, 5, 0, arr3.length - 1));
  }

  private static int binarySearch(int[] arr, int findMe) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == findMe)
        return mid;
      else if (arr[mid] > findMe) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return -1;

  }

  private static int binarySearch(int[] arr, int findMe, int left, int right) {
    if (left > right)
      return -1;
    else {
      int mid = (left + right) / 2;
      if (arr[mid] == findMe)
        return mid;
      else if (arr[mid] > findMe) {
        return binarySearch(arr, findMe, left, mid - 1);
      } else {
        return binarySearch(arr, findMe, mid + 1, right);
      }

    }

  }

  /*
   * private static void mergeSort(int[] arr) { mergeSort(arr, 0, arr.length / 2,
   * arr.length - 1); }
   */
  /**
   * linear search that locates the index of the element findMe
   * 
   * @param arr2
   * @return index of findMe, -1 if it is not there
   */
  private static int sequentialSearch(int[] arr, int findMe) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == findMe)
        return i;
    }

    return -1;
  }

  private static void mergeSort(int[] arr, int i, int j, int k) {

  }

  private static int[] createRandomArray(int num) {
    int arr[] = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = (int) (Math.random() * 20) + 1;
    }

    return arr;
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
