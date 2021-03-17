package week8;

public class Card {
  private String face;
  private String suit;

  public Card(String face, String suit) {
    this.face = face;
    this.suit = suit;
  }

  public String getFace() {
    return face;
  }

  public String getSuit() {
    return suit;
  }

  /**
   * this refers to the instance of the Card that called compareTo
   * 
   * @param c
   * @return
   */
  public int compareTo(Card c) {
    return getValue(this) - getValue(c);
  }

  public static int compare(Card c1, Card c2) {
    // return getValue(c1) - getValue(c2); // Static methods cannot make calls to
    // non-static methods

    return getCardValue(c1) - getCardValue(c2);
  }

  /**
   * helper method because it is only accessible by the class and allows another
   * method to work. IOt is helping a nother method in teh class.
   */
  private int getValue(Card c) {
    String face = c.face;

    try {
      int temp = Integer.parseInt(face);
      return temp;
    } catch (Exception ex) {
      if (face.equals("J"))
        return 11;
      else if (face.equals("Q"))
        return 12;
      else if (face.equals("K"))
        return 13;
      else
        return 14;
    }

  }

  /**
   * helper method because it is only accessible by the class and allows another
   * method to work. IOt is helping a nother method in teh class.
   */
  private static int getCardValue(Card c) {
    String face = c.face;

    try {
      int temp = Integer.parseInt(face);
      return temp;
    } catch (Exception ex) {
      if (face.equals("J"))
        return 11;
      else if (face.equals("Q"))
        return 12;
      else if (face.equals("K"))
        return 13;
      else
        return 14;
    }

  }

  /**
   * The word static means that a method or attribute in a class BELLONGS to the
   * class. And you would call or activate the method or attribute through the
   * class name
   * 
   * Non-tatic methods methong to an object (card1 and card2 were objects, CArd is
   * the class) card1.getSuit();
   * 
   */
}
