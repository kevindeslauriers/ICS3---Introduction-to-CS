package week8;

public class CardDriver {
  public static void main(String[] args) {
    Card card1 = new Card("5", "H");
    Card card2 = new Card("A", "S");

    System.out.println(card1.getSuit());
    /*
     * System.out.println(Card.getSuit()); // Java freaks out. Cannot call a
     * non-static method through the class name
     */

    System.out.println(card1.compareTo(card2));
    System.out.println(Card.compare(card1, card2));
  }
}
