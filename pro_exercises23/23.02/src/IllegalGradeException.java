public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException() {
    super("Illegal grade");
  }
  public IllegalGradeException(int grade) {
    super("Illegal grade" + grade);
  }

}
