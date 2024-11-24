public class Point
{
  private int x;
  private int y;

  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public void setX(int x)
  {
    this.x = x;
  }
  public void setY(int y)
  {
    this.y = y;
  }
  public void moveTo(int newX, int newY)
  {
    this.x = newX;
    this.y = newY;
  }
  public void move(int xDistance, int yDistance)
  {
    this.x = this.x + xDistance;
    this.y = this.y + yDistance;
  }
  public String toString()
  {
    return "(" + x + "," + y + ")";

  }
}
