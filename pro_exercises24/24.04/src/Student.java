import java.io.Serializable;

public class Student implements Serializable
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

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }
  public String toString() {
    return "Student { first name: " + firstName + " last name: " + lastName + " country: " + country + " }";
  }
  public boolean equals (Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Student other = (Student) obj;

    return firstName.equals(other.firstName) &&
        lastName.equals(other.lastName) &&
        country.equals(other.country);
  }
}
