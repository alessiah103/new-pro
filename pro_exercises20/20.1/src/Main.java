public class Main
{
  public static void main(String[] args)
  {
    Car car1 = new Car("Alessia", 157.80, "DB567CG");
    System.out.println(car1.toString());

    Van van1 = new Van("Francesca", 259.50, "BC678RF", 156);
    Van van2 = new Van("Giorgio", 563.6, "BV567HG", 765);
    System.out.println(van1.equals(van2));
  }
}