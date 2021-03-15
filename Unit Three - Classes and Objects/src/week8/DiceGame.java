package week8;

public class DiceGame {
  public static void main(String[] args) {
    GameCube playerOne = new GameCube(); // new is used to instantiate/ constuct an instance of a Class
    GameCube playerTwo = new GameCube(); // GameCube is the class...
                                         // playerOne and playerTwo are objects (instances of the class)

    int numRolls = 10;
    int score1 = 0;
    int score2 = 0;

    for (int i = 0; i < numRolls; i++) {
      playerOne.roll();
      playerTwo.roll();

      System.out.println("Player 1: " + playerOne.getTopSide());
      System.out.println("Player 2: " + playerTwo.getTopSide());

      if (playerOne.getTopSide() > playerTwo.getTopSide()) {
        score1++;
        System.out.println("PLAYER ONE WINS");
      } else if (playerOne.getTopSide() < playerTwo.getTopSide()) {
        score2++;
        System.out.println("PLAYER TWO WINS");
      } else {
        System.out.println("DRAW");
      }
    }

    System.out.println("------------FINAL SCORE------------");
    System.out.println("Player 1: " + score1);
    System.out.println("Player 2: " + score2);
  }
}
