public class Main
{
  public static void main(String[] args)
  {
    Point pointTest1 = new Point(5, 8);
    Point pointTest2 = new Point(9, 5);
    Point pointTest3 = new Point(5, 8);
    Point pointTest4 = new Point(9, 5);

    //test methods in point class
    pointTest1.moveTo(8, 7);
    pointTest2.moveTo(6, 8);
    pointTest3.move(5, 4);
    pointTest4.move(3, 2);

    //print out the two points using the toString method
    System.out.println("Point 1: " + pointTest1.toString());
    System.out.println("Point 2: " + pointTest2.toString());
    System.out.println("Point 3: " + pointTest3.toString());
    System.out.println("Point 4: " + pointTest4.toString());

    double distance = Math.sqrt(
        Math.pow(pointTest2.getX() - pointTest1.getX(), 2) + Math.pow(
            pointTest2.getY() - pointTest1.getY(), 2));
    System.out.println("The distance between the two points is: " + distance);
    //System.out.println("Point 1: " + pointTest1.toString());
    //System.out.println("Point 2: " + pointTest1.toString());
    //System.out.println(pointTest1.getX() + pointTest1.getY());
    //pointTest1.setX(6);
    //System.out.println(pointTest1);
    //System.out.println(pointTest1.getX() + pointTest1.getY());
    //pointTest1.setY(10);
    //System.out.println(pointTest1.getX() + pointTest1.getY());//

  }
}