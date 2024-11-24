public class Main
{
  public static void main(String[] args)
  {
    String firstName = "Alessia";
    String middleName = "Alexandra";
    String lastName = "Hagiu";

    char firstInitial = firstName.charAt (0);
    char secondInitial = middleName.charAt(0);
    char lastInitial = lastName.charAt(0);

    System.out.println( "FullName: " + firstName + " " + middleName + " " + lastName);
    System.out.println("Initials: " + firstInitial + ", " + secondInitial + ", " + lastInitial);
  }
}