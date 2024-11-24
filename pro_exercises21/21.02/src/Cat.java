public class Cat extends Pet
{
  private boolean isAHouseCat;

  public Cat(int age, String name, boolean isAHouseCat) {
    super(age, name);
    this.isAHouseCat = isAHouseCat;
  }

  public String speak() {
    return "Meow";
  }
  public String toString() {
    return super.toString() + " Is a house cat? " + (isAHouseCat ? "Yes" : "No");
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Cat other = (Cat) obj;

    return super.equals(other) &&
        isAHouseCat == other.isAHouseCat;

  }
}
