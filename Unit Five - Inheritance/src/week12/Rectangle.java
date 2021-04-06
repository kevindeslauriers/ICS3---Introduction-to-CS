package week12;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public boolean isSquare() {
    return length == width;
  }

  public double getPerimeter() {
    return 2 * length + 2 * width;
  }

  public double getArea() {
    return length * width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

}
