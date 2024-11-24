public class Person
{
  private String name;
  private String birthday;

  //constructor
  public Person(String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }
  //.

  public void setName(String n)
  {
    name = n;
  }

  public void setBirthday(String b)
  {
    birthday = b;
  }

  public String getName()
  {
    return name;
  }

  public String getBirthday()
  {
    return birthday;
  }
}