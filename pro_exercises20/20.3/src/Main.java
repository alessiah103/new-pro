public class Main
{
  public static void main(String[] args)
  {
  Customer customer = new Customer("Alessia ", "Kollegievenget 6", "7156765", 1001, true);
    System.out.println(customer);

    System.out.println("\nPreferred customer.");

    PreferredCustomer preferred = new PreferredCustomer("Gina", "Bodkervej 5" , "5783493", 5463, true, 1800);
    System.out.println(preferred);
  }
}