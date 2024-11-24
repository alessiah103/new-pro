public class Main
{
  public static void main(String[] args)
  {
    int[] numbers = {2, 7, 8, 10};

    for (int i = 0; i < numbers.length; i++)
    {
      numbers[i] *= 2;
    }

    System.out.print("{ ");
    for (int i = 0; i < numbers.length; i++)
    {
      if (i == numbers.length - 1)
      {
        System.out.print(numbers[i]);
      }
      else
      {
        System.out.print(numbers[i] + ", ");
      }
    }
    System.out.print(" }");
  }
}