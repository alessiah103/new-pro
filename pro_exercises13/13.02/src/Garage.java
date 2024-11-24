public class Garage
{
  private Car carAtPositionOne;
  private Car carAtPositionTwo;

  public Garage()
  {
    this.carAtPositionOne = null;
    this.carAtPositionTwo = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 1)
    {
      return carAtPositionOne != null;
    }
    if (position == 2)
    {
      return carAtPositionTwo != null;
    }
    return false;
  }

  public void park(Car carToBeParked, int atPosition)
  {
    if (!isParkingAreaTaken(atPosition))
    {
      if (atPosition == 1)
      {
        carAtPositionOne = carToBeParked;
      }
      if (atPosition == 2)
      {
        carAtPositionTwo = carToBeParked;
      }
    }
  }

  public Car leaveGarage(int position)
  {
    if (!isParkingAreaTaken(position)){
      return null;
    }
    if (position == 1){
      Car carParked = carAtPositionOne;
      carAtPositionOne = null;
      return carParked;
    }
    else if (position == 2){
      Car carParked = carAtPositionTwo;
      carAtPositionTwo = null;
      return carParked;
    }
    return null;
  }
  public String toString(){
    if (!isParkingAreaTaken(1) && !isParkingAreaTaken(2)){
    return "Two parking available: " + carAtPositionTwo + " and " + carAtPositionTwo;
    }
    else if (isParkingAreaTaken(1) && !isParkingAreaTaken(2)){
      return carAtPositionOne + " is taken, " + carAtPositionTwo + " is not taken.";
    }
    else if (isParkingAreaTaken(1) && !isParkingAreaTaken(2)){
      return carAtPositionOne + " is not taken, " + carAtPositionTwo + " is taken.";
    }
    else{
      return "Both parking slots are taken.";
    }
  }
}
