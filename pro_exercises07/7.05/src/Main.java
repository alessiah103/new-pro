public class Main
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate();

    System.out.println("The date is " + date1.toString());

    date1.setDay(9);
    date1.setYear(2020);

    System.out.println("Date after changes is: " + date1);

    System.out.println("Is this date leap year? " + (date1.isLeapYear() ? "Yes" : "No"));
    System.out.println();
    System.out.println("How many days are in month " + date1.getMonth() + "? ");
    System.out.println("There are " + date1.daysInAMonth());
    System.out.println();
    System.out.println("What astrological sign is in month " + date1.getMonth() + "? It is " + date1.getAstroSign());
    System.out.println();
    System.out.println("What day of the week is on the " + date1.toString());
    System.out.println("It is a " + date1.dayOfWeek());


  }
}