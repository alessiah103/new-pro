public class Apartment
{
  private double rent;
  private int numberOfRooms;
  private Tenant tenant;

  public Apartment(double rent, int numberOfRooms)
  {
    this.rent = rent;
    this.numberOfRooms = numberOfRooms;
    this.tenant = null;
  }

  public Apartment(double rent)
  {
    this.rent = rent;
    this.numberOfRooms = 1;
    this.tenant = null;
  }

  public double getRent()
  {
    return rent;
  }

  public int getNumberOfRooms()
  {
    return numberOfRooms;
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public boolean isAvailable()
  {
    return tenant == null; //returns true if there is no tenant
  }

  public void rentTo(Tenant tenant)
  {
    if (this.tenant == null)
    { //only rent if there is no tenant
      this.tenant = tenant;
    }
  }

  public void evict()
  {
    this.tenant = null; //set tenant to null, so no one renting
  }

  public String toString()
  {
    String result = "Rent: " + rent + ", Rooms: " + numberOfRooms;
    if (tenant != null)
    {
      result += ", Tenant: " + tenant.getName();
    }
    return result;
  }
}
