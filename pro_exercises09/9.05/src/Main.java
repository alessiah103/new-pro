import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String input;

    while (true)
    {
      System.out.println("Enter a string (or 'quit' to exit the program)");
      input = keyboard.nextLine();

      if (input.equals("quit"))
      {
        System.out.println("You have quit the program.");
        break;
      }
      String reversed = "";
      for (int i = input.length() - 1; i >= 0; i--)
      {
        reversed += input.charAt(i); //add each character in reverse order
      }
      System.out.println("Reversed: " + reversed);
    }
  }
}