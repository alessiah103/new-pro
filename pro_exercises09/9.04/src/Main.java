public class Main
{
  public static void main(String[] args)
  {
    int num1 = 1;
    int num2 = 1;
    System.out.println("Fibonacci(0) = " + num1);
    System.out.println("Fibonacci(1) = " + num2);

    for (int i = 2; i < 20; i++)
    {
      int nextNum = num1 + num2;
      num1 = num2;
      num2 = nextNum;
      System.out.println("Fibonacci(" + i + ") = " + nextNum);
    }
  }
}