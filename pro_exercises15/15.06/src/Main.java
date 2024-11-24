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
    return  arrayString;
  }

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 4 integer:");

    int[] array1 = new int[4];
    int[] array2 = new int[4];

    for (int i = 0; i < array1.length; i++) {
      array1[i] = keyboard.nextInt();
    }
    System.out.println("Array 1 " + arrayToString(array1));

    for (int i = 0; i < array2.length; i++) {
      array2[i] = keyboard.nextInt();
    }
    System.out.println("Array 2 " + arrayToString(array2));

    int[] sumArray = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
      sumArray[i] = array1[i] + array2[i];
    }
    System.out.println("Sum array " + arrayToString(sumArray));

    System.out.print("Array 1:" + arrayToString(array1) +
        " Array 2" + arrayToString(array2) + " makes Sum array " + arrayToString(sumArray));
  }
}