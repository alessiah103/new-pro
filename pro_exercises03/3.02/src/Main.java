public class Main
{
  public static void main(String[] args)
  {
    MyDate myDate1 = new MyDate(8, 7, 2000);
    System.out.println(
        "My birthday is " + myDate1.getDay() + "/" + myDate1.getMonth() + "/"
            + myDate1.getYear());

    MyDate myDate2 = new MyDate(31, 8, 2001);
    System.out.println(
        "Ioan's birthday is " + myDate2.getDay() + "/" + myDate2.getMonth()
            + "/" + myDate2.getYear());

    System.out.println("My birthday is " + myDate1.displayDate());
    System.out.println("Ioan's birthday is " + myDate2.displayDate());
  }
}