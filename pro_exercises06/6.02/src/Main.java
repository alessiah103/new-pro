import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter you gender: ");
    String genderInput = keyboard.nextLine();
    char gender = genderInput.charAt(0);

    System.out.println("Enter your age: ");
    int age = keyboard.nextInt();

    if ((gender != 'M' && gender != 'F') || age < 0)
    {
      System.out.println("Error in typed values");
    }
    else if (gender == 'M' && age < 18)
    {
      System.out.println("Boy");
    }
    else if (gender == 'M' && age >= 18)
    {
      System.out.println("Man");
    }
    else if (gender == 'F' && age < 18)
    {
      System.out.println("Girl");
    }
    else if (gender == 'F' && age >= 18)
    {
      System.out.println("Woman");
    }
    keyboard.close();
  }
}