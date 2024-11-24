public class Player
{
  private int points = 50;
  private String name;

  public Player(String name){
    this.name = name;
  }

  public String getName()
  {
    return name;
  }
  public void setPoints(int points)
  {
    this.points = points;
  }

  public void subtractPoints(int points){
    this.points -= points;
  }

  public int getPoints()
  {
    return points;
  }
}
