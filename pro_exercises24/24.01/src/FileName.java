import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileName
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    PrintWriter write = null;

    try {
      System.out.println("Type filename: ");
      String fileName = keyboard.nextLine();
      FileOutputStream fileOut = new FileOutputStream("D:\\SEM1\\new-pro\\pro_exercises24\\24.01\\src\\" + fileName);
      write = new PrintWriter(fileOut);
    } catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    String friendName = "";
    while (!friendName.equalsIgnoreCase("DONE"))
    {
      System.out.println("Type name of friend: ");
      friendName = keyboard.nextLine();

      if (!friendName.equals("DONE")) {
        write.println(friendName);
      }
    }

    write.close();
  }
}
