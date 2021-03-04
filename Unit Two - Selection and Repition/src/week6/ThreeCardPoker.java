package week6;

public class ThreeCardPoker {

  private static final int HEARTS = 0;
  private static final int DIAMONDS = 1;
  private static final int CLUBS = 2;
  private static final int SPADES = 3;
  private static final int NUM_SUITS = 4;
  private static final int NUM_FACES = 13;
  private static final int JACK = 11;
  private static final int QUEEN = 12;
  private static final int KING = 13;
  private static final int ACE = 14;

  public static void main(String[] args) {

    String playerHand = dealCards();
    String dealerHand = dealCards();

    System.out.println("Player: " + playerHand);
    System.out.println("Dealer: " + dealerHand);

    String card1 = getCard(1, "10D 3C 10S");
    String card2 = getCard(2, "10D 3C 10S");
    String card3 = getCard(3, "10D 3C 10S");

  }

  private static String getCard(int index, String hand) {
    if (index == 1)
      return hand.substring(0, hand.indexOf(" "));
    else {
      String temp = hand.substring(hand.indexOf(" ") + 1);
      if (index == 2)
        return temp.substring(0, temp.indexOf(" "));
      else if (index == 3)
        return temp.substring(temp.indexOf(" ") + 1);
      else {
        throw new IllegalArgumentException("Only have 3 cards!");
      }

    }

  }

  private static String dealCards() {
    String cards = "";

    for (int i = 0; i < 3; i++) {
      Boolean hasCard = false;
      while (!hasCard) {
        String card = getCard();
        if (isUnique(cards, card)) {
          cards += card + " ";
          hasCard = true;
        }
      }
    }
    return cards;
  }

  private static String getCard() {
    return getFace() + getSuit();
  }

  private static String getSuit() {
    int suit = (int) (Math.random() * NUM_SUITS);
    if (suit == HEARTS)
      return "H";
    else if (suit == DIAMONDS)
      return "D";
    else if (suit == CLUBS)
      return "C";
    else if (suit == SPADES)
      return "S";
    else
      return null;
  }

  private static String getFace() {
    int face = (int) (Math.random() * NUM_FACES + 2);
    if (face >= 2 && face <= 10)
      return "" + face;
    else if (face == JACK)
      return "J";
    else if (face == QUEEN)
      return "Q";
    else if (face == KING)
      return "K";
    else if (face == ACE)
      return "A";
    else
      return null;
  }

  public static boolean isUnique(String playerHand, String card) {
    return playerHand.indexOf(card) == -1;
  }

}