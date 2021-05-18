import java.util.ArrayList;

public class Delimiters {
  /** The open and close delimiters. */
  private String openDel;
  private String closeDel;

  /**
   * Constructs a Delimiters object where open is the open delimiter and close is
   * the close delimiter.
   * 
   * Precondition: open and close are non-empty strings.
   * 
   */

  public Delimiters(String open, String close) {
    openDel = open;
    closeDel = close;
  }

  /**
   * Returns an ArrayList of delimiters from the array tokens, as described in
   * part (a).
   */

  public ArrayList<String> getDelimitersList(String[] tokens) {
    ArrayList<String> deliminators = new ArrayList<String>();

    for (String token : tokens) {
      if (token.equals(openDel) || token.equals(closeDel))
        deliminators.add(token);
    }

    return deliminators;
  }

  /**
   * Returns true if the delimiters are balanced and false otherwise, as described
   * in part (b).
   * 
   * Precondition: delimiters contains only valid open and close delimiters.
   * 
   */

  public boolean isBalanced(ArrayList<String> delimiters) {
    int numOpen = 0;

    for (String delim : delimiters) {
      if (delim.equals(openDel))
        numOpen++;
      else if (delim.equals(closeDel))
        numOpen--;

      if (numOpen < 0)
        return false;
    }
    return numOpen == 0;
  }

  // There may be instance variables, constructors, and methods that are not
  // shown.

}
