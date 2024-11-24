import java.util.Scanner;

public class Payroll
{
  private String name;
  private int payPerHour;
  private int hours;
  Scanner keyboard;

  public Payroll()
  {
    this.keyboard = new Scanner(System.in);
  }

  public Payroll(String name, int payPerHour, int hours)
  {
    this.name = name;
    this.payPerHour = payPerHour;
    this.hours = hours;
    this.keyboard = new Scanner(System.in);
  }

  public void setName()
  {
    System.out.println("What is your name?");
    String name = keyboard.nextLine();
    this.name = name;
  }

  public void setPayPerHour()
  {
    System.out.println("What is your hourly wage?");
    int payPerHour = keyboard.nextInt();
    this.payPerHour = payPerHour;
  }

  public void setHours()
  {
    System.out.println("What are your working hours?");
    int hours = keyboard.nextInt();
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
}
