public class Main
{
  public static void main(String[] args)
  {
    Person person1 = new Person("Alessia","8th July 2000");
    System.out.println(
        "My name is " + person1.getName() + " and my birthday is on the "
            + person1.getBirthday() + ".");

    Person person2 = new Person("Ioan-Sorin","31st August 2001");
    System.out.println(
        "My name is " + person2.getName() + " and my birthday is on the "
            + person2.getBirthday() + ".");
  }
}