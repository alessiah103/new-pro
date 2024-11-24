import java.util.Scanner;

public class Assignment1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter for values of type int.");

    System.out.println("Type an integer: ");
    int value1 = keyboard.nextInt();

    System.out.println("Type a second integer: ");
    int value2 = keyboard.nextInt();

    System.out.println("Type a third integer: ");
    int value3 = keyboard.nextInt();

    System.out.println("Type a fourth integer: ");
    int value4 = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Type your name: ");
    String name = keyboard.nextLine();

    System.out.println("Hi " + name + ", here are the results of the calculations: ");
    int sum = value1 + value2;
    System.out.println("The sum of (" + value1  + " + " + value2 + ") is " + sum);

    int product = value2 * value3;
    System.out.println("The product of (" + value2  + " * " + value3 + ") is " + product);

    int difference = value3 - value4;
    System.out.println("The difference of (" + value3  + " - " + value4 + ") is " + difference);

    double quotient = (double) value4 / value1;
    System.out.println("The quotient of (" + value4  + " / " + value1 + ") is " + quotient);

    double totalSum = sum + product + difference + quotient;
    System.out.println("The total sum is " + totalSum);
  }
}
