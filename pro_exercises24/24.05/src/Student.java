public class Student
{
  private String firstName;
  private String lastName;
  private String country;

  public Student(String firstName, String lastName, String country) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public String getCountry()
  {
    return country;
  }
}
