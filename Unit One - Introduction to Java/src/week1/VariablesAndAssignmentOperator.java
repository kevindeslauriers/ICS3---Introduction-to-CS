package week1;

public class VariablesAndAssignmentOperator {
  public static void main(String[] args) {
    exampleOne();
    exampleTwo();
    
  }

  private static void exampleTwo() {
    double x = 2.3;       // declare a variable and assign a value to it in one step.
    double y = 3.1;
    double sum = x + y;

    System.out.println(sum);
  }

  private static void exampleOne() {
    // variables are used to store data / information
    int numberOne;    // declare a variable called numberOne that refers to a primitive int
    numberOne = 10;   // assignment operator -- reads as numberOne is assigned 10

    numberOne = numberOne + 1;  // numberOne is assigned numberOne + 1
    System.out.println(numberOne);
  }
}
