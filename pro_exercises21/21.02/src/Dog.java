public class Dog extends Pet
{
  private String breed;

  public Dog(int age, String name, String breed) {
    super(age, name);
    this.breed = breed;
  }
  public String speak() {
    return "Woof";
  }
  public String toString() {
    return super.toString() + " Breed: " + breed;
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Dog other = (Dog) obj;

    return super.equals(other) &&
        breed.equals(other.breed);
  }
}
