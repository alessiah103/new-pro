import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String choice;

    do {
      System.out.println("Enter two values.\nValue 1:");
      int value1 = keyboard.nextInt();
      System.out.println("Value 2:");
      int value2 = keyboard.nextInt();

      // Clear the newline character left in the buffer
      keyboard.nextLine();

      int sum = value1 + value2;
      System.out.println("The sum is: " + sum);

      System.out.print("Do you want to add more numbers? (y/n): ");
      choice = keyboard.nextLine();
    } while (choice.equalsIgnoreCase("y"));

    keyboard.close();
    System.out.println("Program terminated.");
  }
}
