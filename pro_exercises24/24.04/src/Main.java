import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    try {
      FileOutputStream fileOut = new FileOutputStream("D:\\SEM1\\new-pro\\pro_exercises24\\24.04\\src\\obj.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      write.writeObject(new Student("Alessia", "Hagiu", "Italy"));
      write.writeObject(new Student("Ioan", "Baicoianu", "Romania"));
      write.writeObject(new Student("Giovanna", "Rossi", "Spain"));
      write.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    } catch (IOException e) {
      System.out.println("IO Error writing to file");
      System.exit(1);
    }
    System.out.println("Done writing");
  }
}