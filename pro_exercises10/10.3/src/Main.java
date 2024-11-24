import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    while (true)
    {
      double pi = 0;
      double totalSumFromIteration = 0;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("How many iterations should the loop run:");
      double iterations = keyboard.nextInt();

      double denominator = 1;
      for (double iteration = 0; iteration < iterations; iteration++)
      {
        if (iteration % 2 == 0)
        {
          totalSumFromIteration += 1 / denominator;
        }
        else
        {
          totalSumFromIteration -= 1 / denominator;
        }
        //prepare denominator for next loop
        denominator += 2;
      }
      pi = Math.round((4 * totalSumFromIteration) * 100000) / 100000.0;
      System.out.println("The PI is" + pi + ", and normal PI is "
          + Math.round(Math.PI * 100000) / 100000.0);
    }
  }
}