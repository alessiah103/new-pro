import java.util.Random;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Random randomNumber = new Random();
    int random = randomNumber.nextInt(10) + 1;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Guess the number(1-10):");
    int number = keyboard.nextInt();


    if (number == random)
    {
      System.out.println("You were right");
    }
    else if (number < random)
    {
      System.out.println("Too low");
    }
    else if (number > random)
    {
      System.out.println("Too high");
    }
    else
    {
      System.out.println("Invalid value");
    }
    System.out.println("The number was " + random);
  }
}