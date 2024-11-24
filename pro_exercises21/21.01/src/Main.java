public class Main
{
  public static void main(String[] args)
  {
    TwoDimensionalShape tds1 = new Circle(7.0, 7.0, 3.0);
    TwoDimensionalShape tds3 = new Circle(7.0, 7.0, 3.0);
    TwoDimensionalShape tds2 = new Rectangle(3.0, 2.0, 7.0, 3.0);

    System.out.println("Circle area: " + tds1.getArea());
    System.out.println("Rectangle area: " + tds2.getArea());
    System.out.println(tds1.equals(tds3) ? "Yes" : "No");
  }
}
