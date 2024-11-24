public class Main
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1, 2, 4, 6, 7};

    int[] destinationArray = new int[sourceArray.length * 2];

    for (int i = 0; i < sourceArray.length; i++)
    {
      destinationArray[i] = sourceArray[i];
    }
    System.out.print("Destination array { ");
    for (int i = 0; i < destinationArray.length; i++)
    {
      if (i == destinationArray.length - 1)
      {
        System.out.print(destinationArray[i]);
      }
      else
        System.out.print(destinationArray[i] + ", ");
    }
    System.out.print("}");
  }
}
