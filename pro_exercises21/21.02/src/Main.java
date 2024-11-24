public class Main
{
  public static void main(String[] args)
  {
    Animal[] animal = new Animal[4];
    animal[0] = new Frog(2, "Blue");
    animal[1] = new Bee(1, false);
    animal[2] = new Dog(5, "Sindy", "Lupo");
    animal[3] = new Cat(4, "Kitty,", true);

    for (int i = 0; i < animal.length; i++)
    {
      System.out.println("Speak: " + animal[i].speak());
      System.out.println(animal[i]);
    }
  }
}