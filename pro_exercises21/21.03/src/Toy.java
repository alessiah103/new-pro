public abstract class Toy
{
  private int suitableAge;

  public Toy(int suitableAge) {
    this.suitableAge = suitableAge;
  }

  public int getSuitableAge()
  {
    return suitableAge;
  }

  public String justAToysMethod() {
    return "This is something only part of toy class";
  }
  public String toString() {
    return "Suitable age: " + suitableAge;
  }

  public abstract String play();
}
