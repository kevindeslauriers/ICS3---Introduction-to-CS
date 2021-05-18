public class Vocab {
  /** The controlled vocabulary for a Vocab object. */

  private String[] theVocab = { /* contents not shown */ };

  /**
   * Searches for a string in theVocab. Returns true if its String parameter str
   * 
   * is an exact match to an element in theVocab and returns false otherwise.
   * 
   */
  public boolean findWord(String str) {
    for (String s : theVocab) {
      if (s.equals(str))
        return true;
    }

    return false;
  }

  /**
   * Counts how many strings in wordArray are not found in theVocab, as described
   * in
   * 
   * part (a).
   * 
   */

  public int countNotInVocab(String[] wordArray) {
    int count = 0;
    for (String s : wordArray) {
      if (!findWord(s))
        count++;
    }

    return count;
  }

  /**
   * Returns an array containing strings from wordArray not found in theVocab,
   * 
   * as described in part (b).
   * 
   */
  public String[] notInVocab(String[] wordArray) {
    String[] temp = new String[countNotInVocab(wordArray)];
    int i = 0;
    for (String s : wordArray) {
      if (!findWord(s)) {
        temp[i] = s;
        i++;
      }
    }

    return temp;

  }
}
