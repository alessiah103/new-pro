public class Payroll
{
  private String name;
  private int payPerHour;
  private int hours;

  public Payroll()
  {
  }

  public Payroll(String name, int payPerHour, int hours)
  {
    this.name = name;
    this.payPerHour = payPerHour;
    this.hours = hours;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPayPerHour(int payPerHour)
  {
    this.payPerHour = payPerHour;
  }

  public void setHours(int hours)
  {
    this.hours = hours;
  }

  public String getName()
  {
    return name;
  }

  public int getPayPerHour()
  {
    return payPerHour;
  }

  public int getHours()
  {
    return hours;
  }

  public int getGrossPay()
  {
    return payPerHour * hours;
  }

  public String toString()
  {
    return "Name: " + name + ", Pay per hour: " + payPerHour + ", Hours: "
        + hours + ", The gross pay is:" + getGrossPay();
  }
}