package week3;

public class PrintWithFormatting {
  public static void main(String[] args) {
    double sec = 1.2343341;
    int min = 6;

    //  6:01.234

    System.out.printf("%d:%09.3f", min, sec);
    String formattedString = String.format("%d:%09.3f", min, sec);

    System.out.println(formattedString);  //  6:01.234

  }
}
