public class Main
{
  public static void main(String[] args)
  {
    Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting",
        "Vice President");
    System.out.println(
        "Hello, my name is " + employee1.getName() + ", my ID number is "
            + employee1.getIdNumber() + ", my department is "
            + employee1.getDepartment() + " and my position is "
            + employee1.getPosition() + ".");
    Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
    System.out.println(
        "Hello, my name is " + employee2.getName() + ", my ID number is "
            + employee2.getIdNumber() + ", my department is "
            + employee2.getDepartment() + " and my position is "
            + employee2.getPosition() + ".");
    Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing",
        "Engineer");
    System.out.println(
        "Hello, my name is " + employee3.getName() + ", my ID number is "
            + employee3.getIdNumber() + ", my department is "
            + employee3.getDepartment() + " and my position is "
            + employee3.getPosition() + ".");
  }
}