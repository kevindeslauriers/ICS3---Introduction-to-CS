package week9;

public class CodeWordChecker {
  private int minLength;
  private int maxLength;
  private String illegalString;

  public CodeWordChecker(int minLength, int maxLength, String illegalString) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.illegalString = illegalString;
  }

  public CodeWordChecker(String illegalString) {
    this.minLength = 6;
    this.maxLength = 20;
    this.illegalString = illegalString;
  }

  public boolean isValid(String test) {
    return test.length() >= minLength && test.length() <= maxLength && test.indexOf(illegalString) < 0;
  }

}
