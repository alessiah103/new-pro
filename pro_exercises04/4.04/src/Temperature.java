public class Temperature
{
  //field to hold the Fahrenheit temperature
  private double fTemp;

  //constructor that accepts a Fahrenheit temperature
  public Temperature(double fTemp)
  {
    this.fTemp = fTemp;
  }

  //method to set the Fahrenheit temperature
  public void setfTemp(double fTemp)
  {
    this.fTemp = fTemp;
  }

  //method to get the Fahrenheit temperature
  public double getFahrenheit()
  {
    return fTemp;
  }

  //method to convert the Fahrenheit temperature and return it
  public double getCelsius()
  {
    return (5.0/9.0)*(fTemp - 32);
  }

  //same method to convert FTemp but using another process
  public double getKelvin()
  {
    double result = 0;
    result = (5.0/9.0 * (fTemp-32)) + 273;
    return result;
  }
}

