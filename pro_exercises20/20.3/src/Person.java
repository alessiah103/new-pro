public class Person
{
  private String name;
  private String address;
  private String telephoneNumber;

  public Person(String name, String address, String telephoneNumber) {
    this.name = name;
    this.address = address;
    this.telephoneNumber = telephoneNumber;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getAddress()
  {
    return address;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }
  public String getTelephoneNumber() {
    return telephoneNumber;
  }
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }
  public String toString() {
    return "Name: " + name + ", Address: " + address + "Telephone number: " + telephoneNumber;
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person other = (Person) obj;

    return name.equals(other.name) &&
        address.equals(other.address);
  }
}
