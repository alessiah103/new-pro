import java.io.Serializable;

public class Owner implements Serializable
{
  private String firstName;
  private String lastName;

  public Owner(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  public String toString() {
    return firstName + ", " + lastName;
  }
  public boolean equals(Object obj) {
    if(obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Owner other = (Owner)obj;

    return firstName.equals(other.firstName) &&
        lastName.equals(other.lastName);
  }
}
