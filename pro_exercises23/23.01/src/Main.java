import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter x:");
    int x = keyboard.nextInt();
    System.out.println("Enter y:");
    int y = keyboard.nextInt();

    System.out.println("x + y = " + (x+y));
    System.out.println("x - y = " + (x-y));
    try{

      System.out.println("x / y = " + (x/y));

    } catch (ArithmeticException e) {
      System.err.println("Y cannot be 0 " + e.getMessage());
    }
    System.out.println("x * y = " + (x*y));
  }
}