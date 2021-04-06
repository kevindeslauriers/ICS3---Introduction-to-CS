package week12;

public class PetDriver {
  public static void main(String[] args) {

    Animal d1 = new Dog(20); // because a Dog is an Animal
    Animal c1 = new Cat(5);

    /*
     * 
     * Weapon w1 = new Axe(); w1 = new Sword(); w1.use();
     */

    d1.makeSound(); // at runtime it checks the instance of the Animal and uses that version of
                    // makeSound (dynamic binding)
    c1.makeSound();
    c1 = d1;
    c1.makeSound();

  }
}
