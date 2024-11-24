import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<>();
  }
  public int indexOfRegNumber(String regNr) {
    for (int i = 0; i < cars.size(); i++) {
      if (cars.get(i).getRegNumber().equals(regNr)) {
        return i;
      }
    }
    return -1;
  }

  public int getSize()
  {
    return cars.size();
  }

  public ArrayList<Car> getCars()
  {
    return cars;
  }

  public Car getCar(int index)
  {
    if (index <= 0 || index > cars.size())
    {
      return cars.get(index);
    }
    return null;
  }

  public void addCar(Car car)
  {
    cars.add(car);
  }

  public void removeCar(Car car) {
    cars.remove(car);
  }

  public void removeCar(int index) {
    cars.remove(index);
  }

  public String toString() {
    String tmp = "";
    for (int i = 0; i < cars.size(); i++) {
      tmp += cars.get(i).toString();
    }
    return tmp;
  }

}
