public class Main
{
  public static void main(String[] args)
  {
    int[] array = {3, 5, 1, 3, 3, 2, 4, 2, 3};

    int holeInOnes = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 1) {
        holeInOnes++;
      }
    }System.out.println("Number of Hole in One's: " + holeInOnes);

    int totalNumberOfHits = 0;
    for (int i = 0; i < array.length; i++) {
      totalNumberOfHits += array[i];
    }
    System.out.println("Total number of hits: " + totalNumberOfHits);

    int totalSum = 0;
    double average;
    for (int i = 0; i < array.length; i++) {
      totalSum += array[i];
    }
    average = (double) totalSum / array.length;
    System.out.println("The average hits per hole is: " + average);
  }
}