import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the username:");
    String username = keyboard.nextLine();

    System.out.println("Enter the password:");
    String password = keyboard.nextLine();

    System.out.println("Enter the confirmation password:");
    String confirmationPassword = keyboard.nextLine();

    while (!password.equals(confirmationPassword)) {
      System.out.println("Incorrect password. Try again.");

      System.out.println("Enter the password:");
      password = keyboard.nextLine();

      System.out.println("Enter the confirmation password:");
      confirmationPassword = keyboard.nextLine();
    }
    System.out.println("Account created!");
  }
}