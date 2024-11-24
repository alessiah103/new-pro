import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate();

    System.out.println("The date is " + date1.toString());

    date1.setDay(9);
    date1.setYear(2020);

    System.out.println("Date after changes is: " + date1);

    System.out.println(
        "Is this date leap year? " + (date1.isLeapYear() ? "Yes" : "No"));
    System.out.println();
    System.out.println("How many days are in month " + date1.getMonth() + "? ");
    System.out.println("There are " + date1.daysInAMonth());
    System.out.println();
    System.out.println(
        "What astrological sign is in month " + date1.getMonth() + "? It is "
            + date1.getAstroSign());
    System.out.println();
    System.out.println("What day of the week is on the " + date1.toString());
    System.out.println("It is a " + date1.dayOfWeek());

    int counter = 0;
    for (int year = 1582; year < 2024; year++)
    {
      MyDate date2 = new MyDate();
      date2.setYear(year);
      if (date2.isLeapYear())
      {
        counter++;
      }
    }
    System.out.println(
        "There are " + counter + " leap year from 1582 to 2024.");

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter start year:");
    int startYear = keyboard.nextInt();
    System.out.println("Enter end year:");
    int endYear = keyboard.nextInt();

    int counterFromScanner = 0;
    for (int year = startYear; year < endYear; year++)
    {
      MyDate date3 = new MyDate();
      date3.setYear(year);
      if (date3.isLeapYear())
      {
        counterFromScanner++;
      }
    }
    System.out.println("There are " + counterFromScanner + " years from " + startYear + " to " + endYear);

    MyDate birthday = new MyDate(8,7,2000);
    int birthdayCounter = 0;
    while (birthday.getYear() < 2024 ||
        (birthday.getYear() == 2024 && birthday.getMonth() < 10) ||
        (birthday.getYear() == 2024 && birthday.getMonth() == 10 && birthday.getDay() < 28)) {
      birthdayCounter++;
      birthday.nextDay();
    }

    System.out.println("There have been " + birthdayCounter + " days since the birthday.");
  }
}