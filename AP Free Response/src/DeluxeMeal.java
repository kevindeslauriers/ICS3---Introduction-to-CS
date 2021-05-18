public class DeluxeMeal extends Meal {
  /**
   * A String variable representing the name of the side dish included in the meal
   * A String variable representing the name of the drink included in the meal
   */

  private String drink;
  private String sideDish;

  public DeluxeMeal(String name, String sideDish, String drink, double cost) {
    super(name, cost + 3);
    this.drink = drink;
    this.sideDish = sideDish;
  }

  public String toString() {
    return "deluxe " + super.toString();
  }
}
