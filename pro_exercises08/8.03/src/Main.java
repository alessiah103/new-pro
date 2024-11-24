public class Main
{
  public static void main(String[] args)
  {
    // Create a Clock object with an initial time
    Clock clock1 = new Clock(14, 3, 7);
    System.out.println("Initial time: " + clock1);

    // Set a new time
    clock1.set(8, 6, 53);
    System.out.println("After setting new time: " + clock1);

    // Tick the clock by one second
    clock1.tic();
    System.out.println("After ticking: " + clock1);

    // Create another Clock object to compare
    Clock clock2 = new Clock(14, 12, 0);
    System.out.println("Second Clock time: " + clock2);

    // Check if clock1 is before clock2
    System.out.println("Is clock1 before clock2? " + clock1.isBefore(clock2));

    // Calculate the difference in seconds between the two clocks
    int differenceInSeconds = clock1.timeInSecondsTo(clock2);
    System.out.println("Difference in seconds: " + differenceInSeconds);

    // Convert total seconds back to time
    Clock convertedClock = Clock.timeTo(differenceInSeconds);
    System.out.println("Time equivalent of " + differenceInSeconds + " seconds: " + convertedClock);
  }
}