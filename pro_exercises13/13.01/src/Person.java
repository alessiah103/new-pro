public class Person
{
  private String name;
  private String address;
  private MyDate birthday;

  //constructor
  public Person(String name, String address)
  {
    this.name = name;
    this.address = address;
    this.birthday = null;
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.address = null;
    this.birthday = birthday;
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

  public MyDate getBirthday()
  {
    return birthday;
  }
  public int getAge() {
    MyDate today = MyDate.today();
    int age = today.getYear() - birthday.getYear();

    if (birthday.getMonth() > today.getMonth() ||
        (birthday.getMonth() == today.getMonth() && birthday.getDay() > today.getDay())) {
      age--;
    }
    return age;
  }

  public String toString()
  {
    return name + ", " + address + ", " + birthday;
  }

  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.name) && address.equals(other.address)
        && birthday == other.birthday;
  }
}
