import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int positiveSum = 0;
    int negativeSum = 0;
    int x = keyboard.nextInt();
    while (x != 0)
    {
      if (x > 0)
      {
        positiveSum += x;
      }
      else if (x < 0)
      {
        negativeSum += x;
      }
      System.out.println(positiveSum);
      System.out.println(negativeSum);
    }
  }
}