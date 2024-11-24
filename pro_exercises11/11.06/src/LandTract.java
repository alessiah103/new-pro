public class LandTract {
  private double length;
  private double width;

  // Constructor
  public LandTract(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Method to calculate area
  public double getArea() {
    return length * width;
  }

  // Equals method based on area (if needed)
  public boolean equals(LandTract object2) {
    return this.getArea() == object2.getArea();
  }

  // toString method
  public String toString() {
    return "LandTract [Length: " + length + ", Width: " + width + ", Area: " + getArea() + "]";
  }
}
