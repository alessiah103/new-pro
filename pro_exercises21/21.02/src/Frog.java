public class Frog extends Animal
{
  private String color;

  public Frog(int age, String color) {
    super(age);
    this.color = color;
  }
  public String speak() {
    return "Ribbit";
  }

  public String toString() {
    return super.toString() + " Color: " + color;
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Frog other = (Frog) obj;

    return super.equals(other) &&
        color.equals(other.color);
  }
}
