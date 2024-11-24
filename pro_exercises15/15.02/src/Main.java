public class Main
{
  public static void main(String[] args)
  {
    int[] sourceArray = {2, 4, 6, 8};
    int[] destinationArray = new int[sourceArray.length];

    for (int i = 0; i < sourceArray.length; i++)
    {
      destinationArray[i] = sourceArray[i];
    }

    System.out.print("Source array { ");
    for (int i = 0; i < sourceArray.length; i++)
    {
      if (i == sourceArray.length - 1)
      {
        System.out.print(sourceArray[i]);
      }
      else
      {
        System.out.print(sourceArray[i] + ", ");
      }
    }
    System.out.println(" }");

    System.out.print("Destination array {");
    for (int i = 0; i < destinationArray.length; i++)
    {
      if (i == destinationArray.length - 1)
      {
        System.out.print(destinationArray[i]);
      }
      else
      {
        System.out.print(sourceArray[i] + ", ");
      }
    }
    System.out.print(" }");
  }
}