package week3;

public class FunctionsHomework {
  public static void main(String[] args) {
    questionSix();
    questionEleven();
  }

  private static void questionEleven() {
    double mass = 5;
    double velocity = 11.5;

    double kineticEnergy = calculateKineticEnergy(mass, velocity);
    System.out.println("The KE is: " + kineticEnergy);

  }

  private static double calculateKineticEnergy(double mass, double velocity) {
    return (0.5) * mass * Math.pow(velocity, 2);
  }

  private static void questionSix() {
    int mass = 10;
    int velocity = 12;

    double momementum = calculateMomentum(mass, velocity);
    System.out.println("The momentum is: " + momementum);

    momementum = calculateMomentum(11.3, 7.4);
    System.out.println("The momentum is: " + momementum);
  }

  private static double calculateMomentum(double m, double v) {
    return m * v;
  }
}
