public class Meal {
  /**
   * A String variable representing the name of the entree included in the meal A
   * double variable representing the cost, in dollars, of the meal A toString
   * method that indicates information about the meal
   */

  private String name;
  private double cost;

  public Meal(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String toString() {
    return name + " meal, $" + cost;
  }
}
