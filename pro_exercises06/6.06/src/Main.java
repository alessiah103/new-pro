import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter value of a:");
    double a = keyboard.nextDouble();
    System.out.println("Enter value of b:");
    double b = keyboard.nextDouble();
    System.out.println("Enter value of c:");
    double c = keyboard.nextDouble();

    double discriminant = (b * b) - (4 * a * c);

    if (discriminant < 0)
    {
      System.out.println("No real solutions.");
    }
    else if (discriminant == 0)
    {
      double x = -b / (2 * a);
      System.out.println("There is one solution: " + x);
    }
    else
    {
      double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("There are two solutions: " + x1 + " and " + x2);
    }
    keyboard.close();
  }
}