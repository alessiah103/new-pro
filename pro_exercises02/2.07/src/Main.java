import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the first test score:");
    double score1 = keyboard.nextInt();

    System.out.println("Enter the second test score:");
    double score2 = keyboard.nextInt();

    System.out.println("Enter the third test score:");
    double score3 = keyboard.nextInt();

    System.out.println("Test score 1 is: " + score1);
    System.out.println("Test score 2 is: " + score2);
    System.out.println("Test score 3 is: " + score3);

    double scoresAverage = (score1 + score2 + score3) / 3;

    System.out.println("The average score is: " + scoresAverage);
  }
}