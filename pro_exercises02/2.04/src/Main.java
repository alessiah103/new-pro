import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = keyboard.nextLine();

    System.out.println("What is your age?");
    int age = keyboard.nextInt();

    //in between a int and a string this method
    // is needed in order to make it run
    keyboard.nextLine();

    System.out.println("What is your address?");
    String address = keyboard.nextLine();
  }
}