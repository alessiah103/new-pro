public class Main
{
  public static void main(String[] args)
  {
    try
    {
      double[] scores = {85.5, 90.0, 78.0};
      TestScores ts = new TestScores(scores);
      System.out.println("Average score: " + ts.average());

      double[] invalidScores = {85.5, -10, 78.0};
      TestScores tsInvalid = new TestScores(invalidScores);
    }
    catch (IllegalArgumentException e)
    {
      System.out.println("Error: " + e.getMessage());
    }
  }
}