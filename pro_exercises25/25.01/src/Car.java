import java.io.Serializable;

public class Car implements Serializable
{
  private static final long serialVersionUID = 1L;

  private Owner owner;
  private String regNumber;
  private String make;
  private String model;
  private int year;

  public Car(Owner owner, String regNumber, String make, String model, int year)
  {
    this.owner = owner;
    this.regNumber = regNumber;
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public void setOwner(Owner owner)
  {
    this.owner = owner;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public void setRegNumber(String regNumber)
  {
    this.regNumber = regNumber;
  }

  public String getMake()
  {
    return make;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public String getModel()
  {
    return model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public String toString() {
    return regNumber + ", " + make + ", " + model + ", " + year + ", " +
        owner.getFirstName() + ", " + owner.getLastName() + "\n";
  }

  public boolean equals(Object obj)
  {
    if(obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Car other = (Car)obj;

    return regNumber.equals(other.regNumber) && make.equals(other.make) &&
        model.equals(other.model) && year == other.year && owner.equals(other.owner);
  }
}
