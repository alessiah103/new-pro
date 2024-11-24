public class Main {
  public static void main(String[] args) {
    MyDate currentDate1 = MyDate.today();  // Using today() method
    System.out.println("Today's date (using today method): " + currentDate1);

    MyDate currentDate2 = new MyDate();  // Using no-argument constructor
    System.out.println("Today's date (using no-argument constructor): " + currentDate2);
  }
}
