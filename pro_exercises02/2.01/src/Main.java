import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //create scanner object to get user input
    Scanner keybord = new Scanner(System.in);
    System.out.print("What is your favorite city?");
    String name = keybord.nextLine();
    keybord.close();

    int strSize = name.length();
    String upper = name.toUpperCase();
    String lower = name.toLowerCase();
    char firstChar = name.charAt(0);

    System.out.println(
        name + "\n" + strSize + "\n" + upper + "\n" + lower + "\n" + firstChar);
  }
}