public class Person
{
  private String name;
  private String birthday;

  public Person(String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public Person()
  {
    name = "Alessia";
    birthday = "8th July 2000";
  }
  public String getName()
  {
    return name;
  }

  public String getBirthday()
  {
    return birthday;
  }



  public String toString()
  {
    return "Name: " + name + "Birthday: " + birthday;
  }

}