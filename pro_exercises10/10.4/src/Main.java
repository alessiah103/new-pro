import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int product = 0;

    while (product < 100) {
      System.out.println("Enter a number:");
      int number = keyboard.nextInt();
      product = number * 10;
      System.out.println("Product: " + product);
    }
    System.out.println("Loop ended because product is 100 or more.");
  }
}