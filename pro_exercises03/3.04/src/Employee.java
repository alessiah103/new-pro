public class Employee
{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public Employee(String name, int idNumber, String department, String position)
  {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
  }
  public String getName()
  {
    return name;
  }
  public int getIdNumber()
  {
    return idNumber;
  }
  public String getDepartment()
  {
    return department;
  }
  public String getPosition()
  {
    return position;
  }
  public void setName (String n)
  {
    name = n;
  }
  public void setIdNumber (int id)
  {
    idNumber = id;
  }
  public void setDepartment(String d)
  {
    this.department = d;
  }
  public void setPosition( String p)
  {
    position = p;
  }
}
