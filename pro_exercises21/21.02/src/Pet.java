public abstract class Pet extends Animal
{
  private String name;

  public Pet(int age, String name) {
    super (age);
    this.name = name;
  }
  public String toString() {
    return super.toString() + " Name: " + name;
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Pet other = (Pet) obj;

    return super.equals(other) &&
        name.equals(other.name);
  }
}
