public class IllegalDateException extends RuntimeException
{
  public IllegalDateException() {
    super("Illegal date");
  }
  public IllegalDateException(int date) {
    super("Illegal date" + date);
  }
}
