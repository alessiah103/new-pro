public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y, double radius) {
    this.center = new Point(x, y);
    this.radius = radius;

  }
  public Point getCenter() {
    return center;
  }
  public double getRadius() {
    return radius;
  }
  public void moveCircle(double dx, double dy) {
    center.move(dx, dy);
  }
  public double getArea() {
    return Math.PI * radius * radius;
  }
  public String toString() {
    return "Circle[center: " + center + ", radius: " + radius + "]";
  }
  public boolean equals(Object obj) {
  if (obj == null || getClass() != obj.getClass()) {
    return false;
  }
  Circle other = (Circle) obj;

  return radius == other.radius &&
      center == other.center;
  }
}
