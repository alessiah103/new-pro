import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 5 integers:");

    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = keyboard.nextInt();
    }
    System.out.print("Array entered from keyboard {");
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        System.out.print(array[i] + "}");
      } else
        System.out.print(array[i] + ", ");
    }
    int total = 0;
    double average;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    average = (double) total / array.length;
    System.out.println();
    System.out.println("Average: " + average);
  }
}
