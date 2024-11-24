import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //create a Scanner object to get user input
    Scanner keyboard = new Scanner(System.in);

    //ask user to input a Fahrenheit temperature
    System.out.println("Enter a Fahrenheit temperature: ");
    double fTemp = keyboard.nextDouble();

    //create an instance of the Temperature class
    Temperature temp = new Temperature(fTemp);

    //display the temperatures in Fahrenheit, Celsius, and Kelvin
    System.out.println("Fahrenheit: " + temp.getFahrenheit());
    System.out.println("Celsius: " + temp.getCelsius());
    System.out.println("Kelvin: " + temp.getKelvin());
  }
}