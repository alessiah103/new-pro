public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title , double salary ,Person employee){
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }
  public Job(String title, double salary){
    this.title = title;
    this.salary = salary;
    this.employee = new Person("No one", "None");
  }
  public String getTitle()
  {
    return title;
  }
  public double getSalary()
  {
    return salary;
  }
  public Person getEmployee()
  {
    return employee;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }
  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public void givePercentageRaise(double percentage)
  {
    this.salary = (salary * percentage) + salary;
  }

  @Override public String toString()
  {
    return title + ", salary: " + salary
        + ", employee:" + employee;
  }
}