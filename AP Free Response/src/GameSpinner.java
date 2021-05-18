public class GameSpinner {
  private int numSides;
  private int currentRun;
  private int lastSpin;

  public GameSpinner(int numSides) {
    this.numSides = numSides;
    this.currentRun = 0;
    this.lastSpin = -1;
  }

  public int spin() {
    int currentSpin = (int) (Math.random() * numSides + 1);
    if (currentSpin == lastSpin)
      currentRun++;
    else
      currentRun = 1;

    lastSpin = currentSpin;
    return currentSpin;
  }

  public int getCurrentRun() {
    return currentRun;
  }

}
