public class Circle extends TwoDimensionalShape
{
  private double radius;

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }
  public double getArea() {
    return Math.PI * radius * radius;
  }
  public String toString() {
    return super.toString() + "Radius: " +radius;
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Circle other = (Circle) obj;
    return super.equals(other) &&
        radius == other.radius;
  }
}
