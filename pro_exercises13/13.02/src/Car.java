public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  public Car(String make, String model, String color, String licenseNumber,
      int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    this.licenseNumber = null;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getYear()
  {
    return year;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    return new Car(make, model, color, licenseNumber, year);
  }

  public String toString()
  {
    return "Car make: " + make + ", Model: " + model + ", Color:" + color
        + ", License Number:" + licenseNumber + ", Year: " + year;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Car other = (Car) obj;
    return make.equals(other.make) && model.equals(other.model) && color.equals(
        other.color) && licenseNumber.equals(other.licenseNumber)
        && year == other.year;
  }
}

