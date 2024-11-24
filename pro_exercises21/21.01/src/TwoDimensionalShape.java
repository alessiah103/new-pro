public abstract class TwoDimensionalShape
{
  private double x;
  private double y;

  public TwoDimensionalShape(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double x, double y)
  {
    x += x;
    y += y;
  }

  public abstract double getArea();

  public String toString() {
    return "X value: " + x + "Y value: " + y;
  }

  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    TwoDimensionalShape other = (TwoDimensionalShape) obj;

    return x == other.x &&
        y == other.y;
  }
}
