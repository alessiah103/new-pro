public class GarageTest
{
  public static void main(String[] args)
  {
    Garage garage = new Garage ();
    Car car1 = new Car("Ford", "Focus", "Yellow", 2007);
    Car car2 = new Car("Audi", "A4", "Purple", 2009);
    garage.park(car1, 1);
    System.out.println("Car 1 is " + car1);
    System.out.println("Is parking 1 taken? " + (garage.isParkingAreaTaken(1) ? "Yes" : "No"));
    System.out.println("Is parking 2 taken? " + (garage.isParkingAreaTaken(2) ? "Yes" : "No"));
    garage.leaveGarage(1);

    System.out.println("Is parking 1 taken? " + (garage.isParkingAreaTaken(1) ? "Yes" : "No"));
  }
}
