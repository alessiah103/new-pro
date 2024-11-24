public class Circle
  {
    private double radius;

    public Circle()
    {
      radius = 0.0;
    }

    public Circle(double radius)
    {
      this.radius = radius;
    }

    public double getArea()
    {
      return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius()
    {
      return radius;
    }

    public String toString()
    {
      return this.radius + ", " + this.getArea();
    }
  }

