import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many cookies you ate?");
    int cookiesEaten = keyboard.nextInt();

    int totalCookies = 40;
    int totalServings = 10;
    int caloriesPerServing = 300;

    int cookiesPerServing = totalCookies / totalServings;
    int caloriesPerCookie = caloriesPerServing / cookiesPerServing;

    int caloriesConsumed = cookiesEaten * caloriesPerCookie;

    System.out.println("You have consumed: " + caloriesConsumed);
  }
}