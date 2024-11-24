import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a username: ");
    String name = keyboard.nextLine();
    System.out.println("Enter a password: ");
    String password = keyboard.nextLine();
    System.out.println("Enter a confirmation password: ");
    String confirmationPassword = keyboard.nextLine();
    System.out.println(name);

    if (password.equals(confirmationPassword))
    {
      System.out.println("Passwords are equal.");
    }
    else
    {
      System.out.println("Error in typing equal values.");
    }
  }
}