package week12;

// This means that a Box is a Rectangle
// The parent class of the Box is the Rectangle
public class Box extends Rectangle {

  private double height;

  public Box(double length, double width, double height) {
    super(length, width); // if you call your parents constructor you must do it first
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return super.getArea() * height;
  }

  public double getArea() {
    // get the surface area
    return super.getArea() * 2 + height * getLength() * 2 + getWidth() * height * 2;
  }

  public double getPerimeter() {
    // sum of all of the edges
    return super.getPerimeter() * 2 + 4 * height;

  }

  public boolean isSquare() {
    return false;
  }

  public boolean isCube() {

    return super.isSquare() && height == getLength();

  }

}
