public class Main
{
  public static void main(String[] args)
  {
    Circle circle = new Circle(35.5, 40.2, 56.3);
    Point circleCenter = circle.getCenter();

    System.out.println(circle.toString() + " before moving the center.");
    circle.moveCircle(0, 150);

    Circle circle2 = new Circle(circleCenter.getX(), circleCenter.getY(), 58.4);

    CircleList circleList = new CircleList(3);
    System.out.println("Circle list size: " + circleList.getNumberOfCircles());
    circleList.addCircle(circle);
    System.out.println("Circle list size: " + circleList.getNumberOfCircles());
    circleList.addCircle(circle2);
    System.out.println("Circle list size: " + circleList.getNumberOfCircles());
    System.out.println("Circle list, average area: " + circleList.getAverageArea() +
     " Total area: " + circleList.getTotalArea());

    for (int i = 0; i < circleList.getNumberOfCircles(); i++){
      System.out.println(i);
      Circle aCircle = circleList.getCircle(i);

      System.out.println(aCircle.toString());
    }
  }
}