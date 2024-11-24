import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner read = null;
    String fileName = "";
    Scanner keyboard = new Scanner(System.in);
    try{
      System.out.println("What is the filename:");
      fileName = keyboard.nextLine();
      FileInputStream fileIn = new FileInputStream("D:\\SEM1\\new-pro\\pro_exercises24\\24.02\\src\\" + fileName);
      read = new Scanner(fileIn);
    } catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Content of the file " + fileName + ":");
    while (read.hasNext()) {
      System.out.println(read.nextLine());
    }
    read.close();

  }
}