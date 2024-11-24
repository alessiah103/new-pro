import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = keyboard.nextInt();

    for (int i = 1; i <= number; i++)
    {
      System.out.print(i + " ");
    }

    System.out.println();
    number = keyboard.nextInt();
    {
      for (int i = 1; i <= number; i++)
      {
        System.out.print(2 * i + " ");
      }
    }
    System.out.println();
    number = keyboard.nextInt();
    {
      for (int i = 1; i <= number; i++)
      {
        System.out.print(i * i + " ");
      }
    }
  }
}