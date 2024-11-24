public class Main
{
  public class PersonTest
  {
    public static void main(String[] args)
    {
      // Testing MyDate class
      MyDate birthday1 = new MyDate(15, 8, 1990);
      MyDate birthday2 = new MyDate(10, 5, 1985);

      System.out.println("Birthday1: " + birthday1);
      System.out.println("Birthday2: " + birthday2);
      System.out.println(
          "Birthday1 is before Birthday2: " + birthday1.isBefore(birthday2));

      // Testing Address class
      Address address1 = new Address("Maple Street", "123", "54321",
          "Springfield", "USA");
      Address address2 = new Address("Oak Avenue", "456", "67890",
          "Shelbyville", "USA");

      System.out.println("Address1: " + address1);
      System.out.println("Address2: " + address2);
      System.out.println("Address1 short form: " + address1.getStreet() + " "
          + address1.getNumber());

    }
  }
}