public class Main
{
    public static void main(String[] args) {
    int totalSquares = 64;  // A standard chessboard has 64 squares
    double grainsOnCurrentSquare = 1;  // Start with 1 grain on the first square
    double totalGrains = 0;  // Initialize total grains

    for (int square = 1; square <= totalSquares; square++) {
      totalGrains += grainsOnCurrentSquare;  // Add grains on the current square to the total
      grainsOnCurrentSquare *= 2;  // Double the grains for the next square
    }

    System.out.println("Grains on the last square: " + grainsOnCurrentSquare / 2);  // Divide by 2 to get last square's grains
    System.out.println("Total grains on the chessboard: " + totalGrains);
  }
}