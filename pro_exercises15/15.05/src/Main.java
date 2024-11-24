import java.util.Scanner;

public class Main
{
  public static String arrayToString(int[] array) {
    String arrayString = "{";
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        arrayString += array[i] + "}";
      } else
        arrayString += array[i] + ", ";
    }
    return arrayString;
  }

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 4 integers:");

    int[] array1 = new int[4];
    int[] array2 = new int[4];

    boolean arraysAreEqual = true;



    for (int i = 0; i < array1.length; i++)
    {
      array1[i] = keyboard.nextInt();
    }
    System.out.print("Array 1 " + arrayToString(array1));

    System.out.println("Enter 4 integers:");
    for (int i = 0; i < array2.length; i++)
    {
      array2[i] = keyboard.nextInt();
    }
    System.out.println("Array 2 " + arrayToString(array2));
    if (array1.length != array2.length)
    {
      arraysAreEqual = false;
    }
    else
    {
      for (int i = 0; i < array1.length; i++)
      {
        if (array1[i] != array2[i])
        {
          arraysAreEqual = false;
          break;
        }
      }
    }

    String array1String = arrayToString(array1);
    String array2String = arrayToString(array2);

    if (arraysAreEqual)
    {
      System.out.println(
          "Array 1 " + array1String + " and Array 2 " + array2String + " are identical");
    }
    else
      System.out.println(
          "Array 1 " + array1String + " and Array 2 " + array2String + " are not identical");
  }
}