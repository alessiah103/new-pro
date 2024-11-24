public class Main
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(5,7, 2000);

    try {
      date1.setDay(0);
      date1.setMonth(-2);
      date1.setYear(-3);
    } catch (IllegalDateException e) {
      System.err.println("Illegal grade" + e.getMessage());
    }
    System.out.println(date1);
  }
}