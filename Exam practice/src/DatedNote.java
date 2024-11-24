public class DatedNote extends Note
{
  private MyDate date;
  public DatedNote(String message, MyDate date) {
    super(message);
    this.date = date;
  }

  public MyDate getDate()
  {
    return date.copy();
  }
  public Note copy(){
    return new DatedNote(super.getMessage(),date.copy());
  }

  @Override public String toString()
  {
    return super.toString()+ "DatedNote{" + "date=" + date + '}';
  }
}
