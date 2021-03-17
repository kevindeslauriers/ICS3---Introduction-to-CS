package week7;

public class Recursion {
  public static void main(String[] args) {
    /*
     * int x = factorial(7); System.out.println(x);
     * 
     * x = factorial2(7); System.out.println(x);
     */
    /*
     * for (int i = 1; i < 60; i++) { long test = fibonacci(i); System.out.println(i
     * + ": " + test); }
     */

    System.out.println("\nMystery10:\n");
    System.out.println(mystery10(1234));
    System.exit(0);

    System.out.println("\nMystery1:\n");
    System.out.println(mystery1(6, 13));
    System.out.println(mystery1(14, 10));
    System.out.println(mystery1(37, 10));
    System.out.println(mystery1(8, 2));
    System.out.println(mystery1(50, 7));

    System.out.println("\nMystery2:\n");
    mystery2(1);
    System.out.println();
    mystery2(4);
    System.out.println();
    mystery2(16);
    System.out.println();
    mystery2(30);
    System.out.println();
    mystery2(100);
    System.out.println();

    System.out.println("\nMystery3:\n");
    System.out.println(mystery3(6));
    System.out.println(mystery3(17));
    System.out.println(mystery3(259));
    System.out.println(mystery3(977));
    System.out.println(mystery3(-479));

    System.out.println("\nMystery4:\n");
    System.out.println(mystery4(8));
    System.out.println(mystery4(74));
    System.out.println(mystery4(-52));
    System.out.println(mystery4(3052));
    System.out.println(mystery4(82534));

    System.out.println("\nMystery5:\n");
    System.out.println(mystery5(5, 7));
    System.out.println(mystery5(12, 9));
    System.out.println(mystery5(-7, 4));
    System.out.println(mystery5(-23, -48));
    System.out.println(mystery5(128, 343));

    System.out.println("\nMystery6:\n");
    mystery6(4, 1);
    System.out.println();
    mystery6(4, 2);
    System.out.println();
    mystery6(8, 2);
    System.out.println();
    mystery6(4, 3);
    System.out.println();
    mystery6(3, 4);
    System.out.println();

    System.out.println("\nMystery7:\n");
    mystery7(0);
    System.out.println();
    mystery7(1);
    System.out.println();
    mystery7(2);
    System.out.println();
    mystery7(4);
    System.out.println();
    mystery7(5);
    System.out.println();

    System.out.println("\nMystery8:\n");
    mystery8(113);
    System.out.println();
    mystery8(70);
    System.out.println();
    mystery8(42);
    System.out.println();
    mystery8(30);
    System.out.println();
    mystery8(10);
    System.out.println();

    System.out.println("\nMystery9:\n");
    mystery9(7);
    System.out.println();
    mystery9(38);
    System.out.println();
    mystery9(194);
    System.out.println();
    mystery9(782);
    System.out.println();
    mystery9(3842);
    System.out.println();

  }

  /**
   * Obtains the nth number of the fibonacci sequence
   * 
   * @param n the numbe in the sequence to obtain
   * @return the nth number of the fibonacci sequence fibonacci(7) return 13
   */
  private static long fibonacci(int n) {
    if (n == 1 || n == 2)
      return 1;
    else
      return fibonacci(n - 1) + fibonacci(n - 2);
  }

  private static int factorial2(int n) {
    int result = 1;

    for (int i = 1; i <= n; i++) {
      result *= i;
    }

    return result;
  }

  /**
   * Obtains foctorial of the given integer
   * 
   * @param n An int representing the number we would like to obtain the factorial
   * @return n!
   */
  private static int factorial(int n) {
    if (n == 1 || n == 0)
      return 1;
    else
      return n * factorial(n - 1);
  }

  private static int mystery1(int x, int y) {
    if (x < y) {
      return x;
    } else {
      return mystery1(x - y, y);
    }
  }

  private static void mystery2(int n) {
    if (n <= 1) {
      System.out.print(n);
    } else {
      mystery2(n / 2);
      System.out.print(", " + n);
    }
  }

  private static int mystery3(int n) {
    if (n < 0) {
      return -mystery3(-n);
    } else if (n < 10) {
      return n;
    } else {
      return mystery3(n / 10 + n % 10);
    }
  }

  private static int mystery4(int n) {
    if (n < 0) {
      return mystery4(-n);
    } else if (n < 10) {
      return n;
    } else {
      return n % 10 + mystery4(n / 10);
    }
  }

  private static int mystery5(int x, int y) {
    if (x < 0) {
      return mystery5(-x, y);
    } else if (y < 0) {
      return -mystery5(x, -y);
    } else if (x == 0 && y == 0) {
      return 0;
    } else {
      return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + (y % 10);
    }
  }

  private static void mystery6(int x, int y) {
    if (y == 1) {
      System.out.print(x);
    } else {
      System.out.print(x * y + ", ");
      mystery6(x, y - 1);
      System.out.print(", " + x * y);
    }
  }

  private static void mystery7(int n) {
    if (n <= 0) {
      System.out.print("*");
    } else if (n % 2 == 0) {
      System.out.print("(");
      mystery7(n - 1);
      System.out.print(")");
    } else {
      System.out.print("[");
      mystery7(n - 1);
      System.out.print("]");
    }
  }

  private static void mystery8(int n) {
    if (n > 100) {
      System.out.print(n);
    } else {
      mystery8(2 * n);
      System.out.print(", " + n);
    }
  }

  private static void mystery9(int x) {
    if (x < 10) {
      System.out.print(x);
    } else {
      int y = x % 10;
      System.out.print(y);
      mystery9(x / 10);
      System.out.print(y);
    }
  }

  private static int mystery10(int x) {
    if (x < 10) {
      return x;
    } else {
      return x + mystery10(mystery10(x / 10));
    }
  }
}
