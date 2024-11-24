public class Main
{
  public static void main(String[] args)
  {
    Student st1 = new Student("Alessia", 10);
    try
    {
      st1.setGrade(5);
    } catch (IllegalGradeException e) {
      System.err.println("Invalid grade: " + e.getMessage());
    }
    System.out.println(st1);
  }
}