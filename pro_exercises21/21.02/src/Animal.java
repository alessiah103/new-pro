public abstract class Animal
{
  private int age;

  public Animal(int age) {
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }

  public String toString() {
    return "Age: " + age;
  }
  public abstract String speak();

  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Animal other = (Animal) obj;

    return age == other.age;
  }


}
