import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the Danish grade: ");
    int grade = keyboard.nextInt();
    keyboard.close();

    /*if (grade == 12)
    {
      System.out.println("A");
    }
    else if (grade == 10)
    {
      System.out.println("B");
    }
    else if (grade == 7)
    {
      System.out.println("C");
    }
    else if (grade == 4)
    {
      System.out.println("D");
    }
    else if (grade == 2)
    {
      System.out.println("E");
    }
    else if (grade == 0)
    {
      System.out.println("Fx");
    }
    else if (grade == -3)
    {
      System.out.println("F");
    }
    else
    {
      System.out.println("Value not found in 'if' conditions.");
    }*/

    switch (grade)
    {
      case 12:
        System.out.println("A");
        break;
      case 10:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 4:
        System.out.println("D");
        break;
      case 2:
        System.out.println("E");
        break;
      case 0:
        System.out.println("Fx");
        break;
      case -3:
        System.out.println("F");
        break;
      default:
        System.out.println("Value not matching grading system.");
    }
  }
}