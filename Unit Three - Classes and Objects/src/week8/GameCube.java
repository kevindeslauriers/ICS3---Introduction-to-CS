package week8;

/**
 * The GameCube will model a simple Die that could be used for a board game, a
 * dice game or any game that requires a random number.
 * 
 * The class will contain: State: the current state of this GameCube Behaviour:
 * the things that that we can do with the GameCube (public)
 */
public class GameCube {
  private int topSide; // attributes for a GameCube
  private int numSides; // instance variables (used to identify the current state of the object)

  /**
   * Method to create a game cube - create a constructor The purpose of the
   * construtor is to create an instance of the class The constructor is a method
   * with the same name as the class Purpsoe of the constructor is set the initial
   * state of the object.
   * 
   * Return type of constructor is missing and is not needed. When the method is
   * done the user will recieve an instance of a GameCube
   */

  public GameCube(int numberOfSides) {
    numSides = numberOfSides;
    roll();
  }

  /**
   * Overloaded the constructor The no argument constructor is sometimes called
   * the Default constructor
   */
  public GameCube() {
    numSides = 6;
    roll();
  }

  /**
   * When you roll a GameCube you are just setting the top side
   */
  public void roll() {
    topSide = (int) (Math.random() * numSides + 1);
  }

  /**
   * 
   * @return the value of the topside for the GameCube
   */
  public int getTopSide() {
    return topSide;
  }

}
