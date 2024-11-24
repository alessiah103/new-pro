public class Main
{
  public static void main(String[] args)
  {
    double r = 22.5;
    //C= 2 * pigreco * radius
    double circumference = 2 * Math.PI * r;
    //A= pigreco * r to the power of 2
    double area = Math.pow(r, 2) * Math.PI;

    System.out.println("Circumference of the circle: " + circumference);
    System.out.println("Area of the circle: " + area);
  }
}