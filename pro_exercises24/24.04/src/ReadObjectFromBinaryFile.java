import java.io.*;

public class ReadObjectFromBinaryFile
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fileIn = new FileInputStream("D:\\SEM1\\new-pro\\pro_exercises24\\24.04\\src\\obj.bin");
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while (true)
      {
        try
        {
          Student student = (Student) read.readObject();
          System.out.println(student);
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
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
      System.exit(1);
    }

  }
}

