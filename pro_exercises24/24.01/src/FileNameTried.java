import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileNameTried
{
  public static void main(String[] args)
  {
    PrintWriter write = null;
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Type filename: ");
      String fileName = scanner.nextLine();

      FileOutputStream fileOutputStream = new FileOutputStream("D:\\SEM1\\new-pro\\pro_exercises24\\24.01\\src\\" + fileName);
      write = new PrintWriter(fileOutputStream);
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened.");
      System.exit(1);
    }

    String friendName = "";

    while (!friendName.equals("DONE")) {
      System.out.println("Type name of friend: ");
      friendName = scanner.nextLine();

      if (!friendName.equals("DONE")) {
        write.println(friendName);
      }
    }

    write.close();

    System.out.println("Done writing");
  }
}