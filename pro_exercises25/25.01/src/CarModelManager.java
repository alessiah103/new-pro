import java.io.*;
import java.util.Random;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName = "D:\\SEM1\\new-pro\\pro_exercises25\\25.01\\src\\" + fileName;
  }

  public CarList getAllCars() throws IOException, ClassNotFoundException, EOFException
  {
    CarList carList = new CarList();
    try {
      Car[] cars = (Car[]) MyFileHandler.readArrayFromBinaryFile(fileName);
      for (int i = 0; i < cars.length; i++)
      {
        carList.addCar(cars[i]);
      }

      return carList;
    }
    catch (EOFException e) {
      // done reading
    }
    return carList;
  }

  public void addCar(Car car) throws IOException, ClassNotFoundException
  {
    CarList currentCarList = getAllCars();
    currentCarList.addCar(car);

    MyFileHandler.writeArrayToBinaryFile(fileName,
        currentCarList.getCars().toArray());
  }

  public void addCars(CarList carList)
      throws IOException, ClassNotFoundException
  {
    CarList currentCarList = getAllCars();

    for (Car car : carList.getCars())
    {
      currentCarList.addCar(car);
    }

    MyFileHandler.writeToBinaryFile(fileName,
        currentCarList.getCars().toArray());
  }

  public void deleteCar(Car car) throws IOException, ClassNotFoundException
  {
    CarList currentCarList = getAllCars();
    if (currentCarList.getSize() < 1) {
      return;
    }

    currentCarList.removeCar(car);
    MyFileHandler.writeArrayToBinaryFile(fileName,
        currentCarList.getCars().toArray());
  }

  public void deleteCarByRegNumber(String regNr)
      throws IOException, ClassNotFoundException
  {
    CarList currentCarList = getAllCars();
    if (currentCarList.getSize() < 1) {
      return;
    }

    int index = currentCarList.indexOfRegNumber(regNr);
    if (index == -1)
    {
      System.out.println("The registration number could not be found");
      System.exit(1);
    }
    else
    {
      currentCarList.removeCar(index);
      MyFileHandler.writeToBinaryFile(fileName, currentCarList.getCars().toArray());
    }

  }
}
