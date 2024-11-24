import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    /*System.out.println("Smallest number.");
    System.out.println("Enter two numbers: ");
    int x = keyboard.nextInt();
    int y = keyboard.nextInt();

    System.out.println("Smallest number.");
    if (x >= y)
    {
      System.out.println(y);
    }
    else if (y >= x)
    {
      System.out.println(x);
    }

    System.out.println("Sorted numbers.");
    if (x >= y)
    {
      System.out.println(y + ", " + x);
    }
    else if (y >= x)
    {
      System.out.println(x + ", " + y);
    }*/

    System.out.println("Enter three numbers: ");
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();
    System.out.println("Sorting of three numbers.");

    if (a > b && a > c)
    {
      if (b > c)
      {
        System.out.println(c + ", " + b + ", " + a);
      }
      else
      {
        System.out.println(b + ", " + c + ", " + a);
      }
    }
    else if (b > c)
    {
      if (a > c)
      {
        System.out.println(c + ", " + a + ", " + b);
      }
      else
      {
        System.out.println(a + ", " + c + ", " + b);
      }
    }
    else
    {
      if (a > b)
      {
        System.out.println(b + ", " + a + ", " + c);
      }
      else
      {
        System.out.println(a + ", " + b + ", " + c);
      }
    }
  }
}