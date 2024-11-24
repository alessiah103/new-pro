public class Main
{
  public static void main(String[] args)
  {
    Car car = new Car(2017, "Mercedes");
    //this is how you call a method
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    System.out.println();
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
  }
}