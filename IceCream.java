public class IceCream {

private String name;
private double price;
private boolean hasCone;

  /**
  *No-Argument Constructor
  */
  public IceCream() {
  name = "unknown";
  price = 4.99;
  hasCone = false;
}

    /**
  *Parameterized Constructor, sets name and price
  */
  public IceCream(String name, double price) {
  this.name = name;
  this.price = price;
  hasCone = false;
}

    /**
  *Parameterized Constructor, sets name, price, and hasCone
  */
  public IceCream(String name, double price, boolean hasCone) {
  this.name = name;
  this.price = price;
  this.hasCone = hasCone;
}

  /**
  *Accessor method for name
  */
  public String getName() {
  return name;  
  }

  /**
  *Mutator method for name
  */
  public void setName(String name) {
    this.name = name;
  }

  /**
  *Accessor method for price
  */
  public double getPrice() {
    return price;
  }
  
  /**
  *Mutator method for price
  */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
  *Accessor method for hasCone
  */
  public boolean getHasCone() {
    return hasCone;
  }

  /**
  *Mutator method for hasCone
  */
  public void setHasCone(boolean hasCone) {
    this.hasCone = hasCone;
  }

  /**
  *toString method overriding origional toString method
  */
  public String toString() {
    return "\nName: " + name + "\n" + "Price: $" + price + "\n" + "Has a cone: " + hasCone;
  }

  
}