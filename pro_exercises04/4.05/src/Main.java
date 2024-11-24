public class Main
{
  public static void main(String[] args)
  {
     /*Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter three test scores.");
    System.out.println("First score: ");
    double score1 = keyboard.nextDouble(); // variable stores/saves input of user (in this case a double)
    System.out.println("Second score: ");
    double score2 = keyboard.nextDouble();
    System.out.println("Third score: ");
    double score3 = keyboard.nextDouble();

    //create an instance of the TestScores class using the scores entered
    TestScores testScores = new TestScores(score1, score2, score3);

    //display the individual test scores
    System.out.println("\nTest Scores: ");
    System.out.println("Score 1: " + testScores.getScore1());
    System.out.println("Score 2: " + testScores.getScore2());
    System.out.println("Score 3: " + testScores.getScore3());

    //calculate and display the average of test scores
    double average = testScores.getAverage();
    String text = "The average for the scores mentioned before will be: ";
    System.out.println(text + average);*/
    TestScores test = new TestScores(0.1, 0.2, 0.3);

    double average = test.getAverage();
    System.out.println("Average1: " + average);

    test.setScore1(0.4);
    test.setScore2(0.5);
    test.setScore3(0.6);
    double average2 = test.getAverage();
    System.out.println("Average2: " + average2);
  }
}