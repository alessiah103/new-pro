import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Payroll payroll1 = new Payroll();
    Scanner keyboard = new Scanner(System.in);

    payroll1.setName();
    payroll1.setPayPerHour();
    payroll1.setHours();

    System.out.println(
        "Hello, my name is " + payroll1.getName() + ", " + "my hourly pay is "
            + payroll1.getPayPerHour() + " and I work a total of "
            + payroll1.getHours() + " hours per week.");
    System.out.println("My gross pay is " + payroll1.getGrossPay() + ".");
  }
}