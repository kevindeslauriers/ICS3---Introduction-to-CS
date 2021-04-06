package week12;

public abstract class Animal {
  private int weight;

  public Animal(int weight) {
    this.weight = weight;
  }

  public abstract void makeSound();

  public void eat() {
    weight++;
  }

  public int getWeight() {
    return weight;
  }
}
