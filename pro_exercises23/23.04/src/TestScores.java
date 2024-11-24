public class TestScores
{
  private double[] testScores;

  public TestScores(double[] testScores) {
    for(int i = 0; i < testScores.length; i++) {
      if(testScores[i] < 0 || testScores[i] > 100) {
        throw new IllegalArgumentException("Test score must be between 0 and 100");
      }
    }
    this.testScores = testScores;
  }
  public double average() {
    double total = 0;

    for (int i = 0; i < testScores.length; i++) {
      total += testScores[i];
    }
    return total / testScores.length;
  }
}
