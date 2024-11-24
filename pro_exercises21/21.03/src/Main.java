public class Main
{
  public static void main(String[] args)
  {
    Toy[] toy = new Toy[3];
    toy[0] = new Lego(4,6);
    toy[1] = new Football(5, 6);
    toy[2] = new Handball(6, 7);

    for (int i = 0; i < toy.length; i++) {
      System.out.println("Play: " + toy[i].play());
      System.out.println(toy[i]);
    }
  }
}