package week4;

public class IfStatements {
  public static void main(String[] args) {
    exampleOne();
  }

  /**
   * Use if statemets to perform logic in your code.
   * if(<boolean expression>){
   *    what you do when the expression is true
   * }else if (<boolean expression>){ // else the above expression was false and we want to check another condition
   *  what you do when the expression is true
   * }else{
   *  everything was false
   * }
   */
  private static void exampleOne() {
    int mark = 87;
    String letterGrade;

    if (mark >= 90){
      letterGrade = "A+";
    }else if(mark >= 80){
      letterGrade = "A";
    }else if(mark >= 70){
      letterGrade = "B";
    }else if(mark >= 60){
      letterGrade = "C";
    }else if(mark >= 50){
      letterGrade = "D";
    }else{
      letterGrade = "F";
    }

    System.out.println("You got an " + letterGrade);
  }
}
