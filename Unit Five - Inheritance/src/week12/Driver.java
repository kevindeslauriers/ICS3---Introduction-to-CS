package week12;

public class Driver {
  public static void main(String[] args) {
    /*
     * Rectangle rect1 = new Rectangle(5, 4);
     * 
     * System.out.println(rect1.getArea());
     * System.out.println(rect1.getPerimeter());
     * System.out.println(rect1.isSquare());
     * 
     * Rectangle rect2 = new Rectangle(4, 4);
     * 
     * System.out.println(rect2.getArea());
     * System.out.println(rect2.getPerimeter());
     * System.out.println(rect2.isSquare());
     */
    // Java will only Create a Default Constructor if you do not create constructors
    // for the class
    // Rectangle reect3 = new Rectangle();

    // Java by default will supply a no argument constructor that does nothing (BUT
    // call your parents no argument constructor)
    // Driver d = new Driver();

    Box box1 = new Box(1, 2, 3);
    System.out.println(box1.getArea());
    System.out.println(box1.isCube());
    System.out.println(box1.getVolume());
    System.out.println(box1.getPerimeter());

  }
}
