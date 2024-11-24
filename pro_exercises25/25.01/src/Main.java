import java.io.IOException;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
      throws IOException, ClassNotFoundException
  {
    boolean programIsRunning = true;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Type name of the file");
    String fileName = keyboard.nextLine();
    CarModelManager carModelManager = new CarModelManager(fileName);

    while (programIsRunning)
    {
      System.out.println("Choose one of the options:");
      System.out.println("Type 1 - get all cars");
      System.out.println("Type 2 - add car");
      System.out.println("Type 3 - add cars");
      System.out.println("Type 4 - delete car by its object");
      System.out.println("Type 5 - delete car by reg. number");
      System.out.println("Type 6 - exit");

      int option = keyboard.nextInt();

      if (option == 6)
      {
        programIsRunning = false;
      }

      switch (option)
      {
        case 1:
        {
          CarList carList = carModelManager.getAllCars();
          if (carList.getSize() < 1) {
            System.out.println("There are no cars inside " + fileName);
          }
          else {
            System.out.println("Cars inside " + fileName);
            System.out.println(carList.toString());
          }
          break;
        }
        case 2:
        {
          keyboard.nextLine();
          System.out.println("Adding new car");

          System.out.println("What is the first name of the owner?");
          String ownerFirstName = keyboard.nextLine();

          System.out.println("What is the last name of the owner?");
          String ownerLastName = keyboard.nextLine();

          System.out.println("What is car's registration number?");
          String regNumber = keyboard.nextLine();

          System.out.println("What is car's make?");
          String make = keyboard.nextLine();

          System.out.println("What is car's model?");
          String model = keyboard.nextLine();

          System.out.println("What is car's year?");
          int year = keyboard.nextInt();

          Car newCar = new Car(new Owner(ownerFirstName, ownerLastName),
              regNumber, make, model, year);
          carModelManager.addCar(newCar);

          break;
        }
        case 3:
        {
          System.out.println("Adding multiple cars");
          CarList carList = new CarList();

          System.out.println("How many cars do you want to add?");
          int numberOfCarsToBeAdded = keyboard.nextInt();

          for (int i = 0; i < numberOfCarsToBeAdded; i++)
          {
            System.out.println("What is the first name of the owner?");
            String ownerFirstName = keyboard.nextLine();

            System.out.println("What is the last name of the owner?");
            String ownerLastName = keyboard.nextLine();

            System.out.println("What is car's registration number?");
            String regNumber = keyboard.nextLine();

            System.out.println("What is car's make?");
            String make = keyboard.nextLine();

            System.out.println("What is car's model?");
            String model = keyboard.nextLine();

            System.out.println("What is car's year?");
            int year = keyboard.nextInt();

            Car newCar = new Car(new Owner(ownerFirstName, ownerLastName),
                regNumber, make, model, year);
            carList.addCar(newCar);
          }

          carModelManager.addCars(carList);

          break;
        }
        case 4:
        {
          System.out.println("Delete car by its object: ");

          System.out.println("What is the first name of the owner?");
          String ownerFirstName = keyboard.nextLine();

          System.out.println("What is the last name of the owner?");
          String ownerLastName = keyboard.nextLine();

          System.out.println("What is car's registration number?");
          String regNumber = keyboard.nextLine();

          System.out.println("What is car's make?");
          String make = keyboard.nextLine();

          System.out.println("What is car's model?");
          String model = keyboard.nextLine();

          System.out.println("What is car's year?");
          int year = keyboard.nextInt();

          Car carToBeDeleted = new Car(new Owner(ownerFirstName, ownerLastName),
              regNumber, make, model, year);
          carModelManager.deleteCar(carToBeDeleted);

          break;
        }
        case 5:
        {
          System.out.println("Delete car by its registration number: ");

          System.out.println("What is car's registration number?");
          String regNumber = keyboard.nextLine();

          carModelManager.deleteCarByRegNumber(regNumber);
          break;
        }
        default:
        {
          System.out.println("You have chosen a wrong option.");
          break;
        }
      }
    }
  }
}