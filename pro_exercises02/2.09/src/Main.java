import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    //purchase details
    int shares = 1000;
    final double purchasePricePerShare = 32.87;
    double commissionRate = 0.2;

    double amountPaidForStock = shares * purchasePricePerShare;
    double purchaseCommission = amountPaidForStock * commissionRate;

    //stock sold
    double salesPricePerShare = 33.92;

    double amountReceivedFromSale = shares * salesPricePerShare;
    double salesCommission = amountReceivedFromSale * commissionRate;
    double profit = (amountReceivedFromSale - salesCommission) - (amountPaidForStock + purchaseCommission);

    System.out.println("Amount paid for the stock: $" + amountPaidForStock);
    System.out.println("Commission paid on the purchase: $" + purchaseCommission);
    System.out.println("Amount received from selling the stock: $" + amountReceivedFromSale);
    System.out.println("Commission paid on the sale: $" + salesCommission);
    System.out.println("Profit: $" + profit);


    //explanation of array of type int
    int[] numbers = new int[10];

    numbers[0] = 5;
    numbers[1] = 6;
    numbers[2] = 7;
    numbers[3] = 8;

    System.out.println(Arrays.toString(numbers));

    //explanation of array of type char connected to type String
    char[] letters = new char[10];
    letters[0] = 'H';
    letters[1] = 'e';
    letters[2] = 'l';
    letters[3] = 'l';
    letters[4] = 'o';

    System.out.println(Arrays.toString(letters));
  }
}