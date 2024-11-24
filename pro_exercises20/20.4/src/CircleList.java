import java.util.ArrayList;

public class CircleList
{
  private int capacity;
  private ArrayList<Circle> circles;

  public CircleList(int capacity) {
    this.capacity = capacity;
    circles = new ArrayList<>(capacity);
  }
  public int getNumberOfCircles() {
    return circles.size();
  }
  public void addCircle(Circle circle) {
    if (circles.size() < capacity) {
      circles.add(circle);
    }
  }
  public Circle getCircle(int index) {
    if (index >= 0 && index < circles.size()) {
      return circles.get(index);
    }
    else return null;
  }
  public double getTotalArea() {
    double totalArea = 0;
    for (int i = 0; i < circles.size(); i++) {
      totalArea += circles.get(i).getArea();
    }
    return totalArea;
  }
  public double getAverageArea() {
    if (circles.isEmpty()) {
      return 0;
    }
    return getTotalArea() / circles.size();
  }
}
