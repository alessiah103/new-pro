public class Bee extends Animal
{
  private boolean isAHoneyBee;

  public Bee(int age, boolean isAHoneyBee) {
    super(age);
    this.isAHoneyBee = isAHoneyBee;
  }
  public String speak() {
    return "Bzzz";
  }
  public String toString() {
    return super.toString() + " Is a honey bee?" + (isAHoneyBee ? "Yes" : "No");
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Bee other = (Bee) obj;

    return super.equals(other) &&
        isAHoneyBee == other.isAHoneyBee;
  }
}
