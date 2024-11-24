
public class Person
{
  private String name;
  private Address address;
  private MyDate birthday;
  private Brain brain;

  //constructor
  public Person(String name, Address address, MyDate birthday, Brain brain)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.address = null;
    this.birthday = birthday;
    this.brain = new Brain();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public int getAge()
  {
    int year = MyDate.today().getyear();
    int month = MyDate.today().getmonth();
    MyDate yearOfBirth = new MyDate();
    if (yearOfBirth.getmonth() > month)
    {
      return (MyDate.today().getyear() - yearOfBirth.getyear() - 1);
    }
    return MyDate.today().getyear() - yearOfBirth.getyear();
  }

  public String toString()
  {
    return name + ", " + address + ", " + birthday + ", " + brain.getIQ();
  }

  public boolean equals(Object obj)
  {
    if (obj == this) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.name) &&
        address.equals(other.address) &&
        birthday == other.birthday &&
        brain == other.brain;
  }
  public boolean doYouRemember (String topic){
    return brain.recall(topic);
  }
  public String whatAreYouThinkingAbout(){
    return brain.recall();
  }
}
