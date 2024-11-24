import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is the price for item number one?");
    int price1 = keyboard.nextInt();

    System.out.println("What is the price for item number two?");
    int price2 = keyboard.nextInt();

    System.out.println("What is the price for item number three?");
    int price3 = keyboard.nextInt();

    System.out.println("What is the sales tax?");
    double salesTax = keyboard.nextDouble();

    double totalPriceBeforeTax = price1 + price2 + price3;
    double taxedPrice = totalPriceBeforeTax * salesTax;
    double totalPriceWithTax = totalPriceBeforeTax + taxedPrice;

    System.out.println("Total price before tax is " + totalPriceBeforeTax);
    System.out.println("Taxed price is " + taxedPrice);
    System.out.println("Total price after tax is " + totalPriceWithTax);
  }
}