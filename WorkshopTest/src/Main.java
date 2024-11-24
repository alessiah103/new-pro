public class Main
{
  public static void main(String[] args)
  {
    Apartment apartment1 = new Apartment(3000, 2);
    Apartment apartment2 = new Apartment(3240, 5);
    Apartment apartment3 = new Apartment(3624);

    apartment1.setRent(6230);

    Tenant tenant1 = new Tenant("Alessia");
    Tenant tenant2 = new Tenant("Giorgia");

    apartment2.rentTo(tenant1);
    apartment3.rentTo(tenant2);

    System.out.println(apartment1.toString());
    System.out.println(apartment2.toString());
    System.out.println(apartment3.toString());

    apartment3.evict();
    System.out.println(apartment3);

    System.out.println(apartment2.isAvailable());
  }
}