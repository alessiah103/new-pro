public class TableOf5
{
  public static void main(String[] args)
  {
    int number = 5;  // The number for which we want the multiplication table

    // For loop to print the table from 5 * 1 to 5 * 10
    for (int i = 1; i <= 10; i++) {
      int result = number * i;
      System.out.println(number + " * " + i + " = " + result);
    }
  }
}
