import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Write
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    try {
      System.out.println("How many integers?");
      int limit = keyboard.nextInt();
      FileOutputStream fileOut = new FileOutputStream("D:\\SEM1\\new-pro\\pro_exercises24\\24.03\\src\\file.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut); 
      for (int i = 0; i < limit; i++) {
        Random random = new Random();
        int generatedNr = random.nextInt(100);
        write.write(generatedNr);
        System.out.println(generatedNr);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    } catch (IOException e) {
      System.out.println("IO error writing to file");
      System.exit(1);
    }
    System.out.println("Done writing.");
  }
}