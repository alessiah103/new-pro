public class Customer extends Person
{
  private int customerNr;
  private boolean wishesMails;

  public Customer(String name,String address, String telephoneNumber, int customerNr, boolean wishesMails) {
    super(name, address, telephoneNumber);
    this.customerNr = customerNr;
    this.wishesMails = wishesMails;
  }
  public int getCustomerNr()
  {
    return customerNr;
  }
  public void setCustomerNr(int customerNr)
  {
    this.customerNr = customerNr;
  }
  public boolean isWishesMails() {
    return wishesMails;
  }
  public void setWishesMails(boolean wishesMails)
  {
    this.wishesMails = wishesMails;
  }
  public String toString() {
    return super.toString() + "\nCustomer number: " + customerNr + ", \nwishes to be mailed? " + (wishesMails ? "Yes" : "No");
  }
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Customer other = (Customer)obj;

    return super.equals(other) &&
        customerNr == other.customerNr &&
        wishesMails == other.wishesMails;
  }
}
