public class PreferredCustomer extends Customer
{
  private double totalPurchases;
  private double discounts;

  public PreferredCustomer(String name, String address, String telephoneNumber, int customerNr, boolean wishesMails, double totalPurchases){
    super(name, address, telephoneNumber, customerNr, wishesMails);
    this.totalPurchases = totalPurchases;
    setDiscounts();
  }
  public double getTotalPurchases() {
    return totalPurchases;
  }
  public void setTotalPurchases(double totalPurchases) {
    this.totalPurchases = totalPurchases;
    setDiscounts();
  }
  public double getDiscounts() {
    return discounts;
    }
  public void setDiscounts() {
    if (totalPurchases >= 2000) {
      discounts = 0.10;
    } else if (totalPurchases >= 1500) {
      discounts = 0.7;
    } else if (totalPurchases >= 1000) {
      discounts = 0.6;
    } else if (totalPurchases >= 500) {
      discounts = 0.5;
    } else {
      discounts = 0.0;
    }
  }
  public String toString() {
    return super.toString() + "\nTotal purchases: " + totalPurchases + "\nDiscount level: " + discounts + "%";
  }
}
