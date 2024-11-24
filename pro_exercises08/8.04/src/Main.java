public class Main {
  public static void main(String[] args) {
    Clock clock = new Clock(20, 5, 40);

    // Display time in 24-hour format (default)
    System.out.println("24-hour format: " + clock);

    // Switch to 12-hour format and display
    clock.setTimeFormat(12);
    System.out.println("12-hour format: " + clock);

    // Set the time format back to 24-hour and display
    clock.setTimeFormat(24);
    System.out.println("24-hour format again: " + clock);
  }
}