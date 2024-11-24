public class Main
{
  public static void main(String[] args)
  {
    //item prices before tax
    int itemPrice1 = 80;
    int itemPrice2 = 140;
    int itemPrice3 = 230;
    double salesTax = 0.25;

    double totalPriceBeforeTax = itemPrice1 + itemPrice2 + itemPrice3;
    //sales tax calculation
    double taxedPrice = totalPriceBeforeTax * salesTax;
    double totalPriceAfterTax = totalPriceBeforeTax + taxedPrice;

    System.out.println("Total price before tax: " + totalPriceBeforeTax);
    System.out.println("Taxed price: " + taxedPrice);
    System.out.println("Total price with tax: " + totalPriceAfterTax);
  }
}