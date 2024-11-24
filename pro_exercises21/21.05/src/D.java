public class D extends B
{
  private double q;
  private double r;

  public D(int n, double r) {
    super(n);
    this.r = r;
  }
  public double getQ()
  {
    return q;
  }

  public void setQ(double q)
  {
    this.q = q;
  }

  public double getR()
  {
    return r;
  }

  public void setR(double r)
  {
    this.r = r;
  }
  public double calc() {
    return q * r;
  }
}
