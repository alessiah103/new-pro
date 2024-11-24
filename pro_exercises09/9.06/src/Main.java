import java.util.Random;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Random randomNumbers = new Random();
    int numberGuess = randomNumbers.nextInt(1000) + 1;
    Scanner keyboard = new Scanner(System.in);

    int attempts = 0;
    int userGuess = 0;

    while (userGuess != numberGuess)
    {
      System.out.println("Guess a number between 1 and 1000: ");
      userGuess = keyboard.nextInt();
      attempts++;
      if (userGuess < 1 || userGuess > 1000){
        System.out.println("Incorrect value");
        continue;
      }

      if (userGuess > numberGuess)
      {
        System.out.println("Too high");
      }
      else if (userGuess < numberGuess)
      {
        System.out.println("Too low");
      }
    }

    System.out.println("Congratulations! Good Guess.");
    System.out.println("it took you " + attempts + " attempts.");
  }
}