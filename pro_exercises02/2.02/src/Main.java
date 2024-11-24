import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println(
        "Please type three integers below." + "\n" + "The first one:");
    int number1 = keyboard.nextInt();

    System.out.println("The second one:");
    int number2 = keyboard.nextInt();

    System.out.println("The third one:");
    int number3 = keyboard.nextInt();

    int sum = number1 + number2 + number3;
    int product = number1 * number2 * number3;

    System.out.println("The sum of the two numbers is: " + sum);
    System.out.println("The product of the two numbers is: " + product);
  }
}