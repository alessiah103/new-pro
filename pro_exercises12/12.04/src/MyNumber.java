public class MyNumber {
  private int number;

  // Constructor
  public MyNumber(int number) {
    this.number = number;
  }

  // Getter for the instance variable
  public int getNumber() {
    return number;
  }

  // Method to get the last digit of the number
  public int getLastDigit() {
    return Math.abs(number) % 10;
  }

  // Method to get the first digit of the number
  public int getFirstDigit() {
    int n = Math.abs(number);
    while (n >= 10) {
      n /= 10;
    }
    return n;
  }

  // Method to check if the number is divisible by another integer
  public boolean isDivisibleBy(int anotherInt) {
    if (anotherInt == 0) {
      return false; // prevent division by zero
    }
    return number % anotherInt == 0;
  }

  // Method to return the number of proper divisors
  public int numberOfProperDivisors() {
    int count = 0;
    for (int i = 1; i <= Math.abs(number) / 2; i++) {
      if (isDivisibleBy(i)) {
        count++;
      }
    }
    return count;
  }

  // Method to check if the number is prime
  public boolean isPrime() {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Method to convert the number to a string with additional prime information if applicable
  @Override
  public String toString() {
    if (isPrime()) {
      return number + " (a prime number)";
    }
    return String.valueOf(number);
  }

  // Method to add another MyNumber object
  public MyNumber plus(MyNumber anotherNumber) {
    if (anotherNumber == null) {
      return new MyNumber(this.number); // add 0 if the argument is null
    }
    return new MyNumber(this.number + anotherNumber.getNumber());
  }

  // Method to check if the number is a perfect number
  public boolean isPerfectNumber() {
    int sum = 0;
    for (int i = 1; i <= Math.abs(number) / 2; i++) {
      if (isDivisibleBy(i)) {
        sum += i;
      }
    }
    return sum == number;
  }
}
