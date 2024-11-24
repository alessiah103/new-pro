import java.io.*;

public class Read
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fileIn = new FileInputStream(
          "D:\\SEM1\\new-pro\\pro_exercises24\\24.03\\src\\file.bin");
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while (true)
      {
        try
        {
          int x = read.readInt();
          double y = read.readDouble();
          System.out.println(x + " " + y);
        }
        catch (EOFException eof)
        {
          System.out.println("End of file");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
      System.exit(1);
    }
  }
}
