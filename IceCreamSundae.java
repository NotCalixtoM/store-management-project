public class IceCreamSundae extends IceCream {

private boolean hasCherry;
private int numScoops = 1;

  public IceCreamSundae() {
    super("Ice Cream Sundae", 5.99);
  }

  public IceCreamSundae(boolean hasCone, boolean hasCherry) {
    super("Ice Cream Sundae", 5.99);
    this.hasCherry = hasCherry;
    if (hasCone = true) {
      super.setPrice(6.99);
    }
    if (hasCherry = true) {
      super.setPrice(super.getPrice() + 1.00);
    }
    
  }

  public IceCreamSundae(boolean hasCone, boolean hasCherry, int numScoops) {
    super("Ice Cream Sundae", 5.99, hasCone);
    this.hasCherry = hasCherry;
    this.numScoops = numScoops;
    if (hasCone = true) {
      super.setPrice(6.99);
    }
    if (hasCherry = true) {
      super.setPrice(super.getPrice() + 1.00);
    }
    super.setPrice(super.getPrice() + (numScoops - 1) * 1.50);
  }
  /**
  *Accessor method for numScoops
  */
  public int getNumScoops() {
    return numScoops;
  }

  /**
  *Mutator method for numScoops
  */
  public void setNumScoops(int numScoops) {
    this.numScoops = numScoops;
  }
  
  /**
  *Accessor method for hasChery
  */
  public boolean getHasCherry() {
    return hasCherry;
  }

  /**
  *Mutator method for hasCherry
  */
  public void setHasCherry(boolean hasCherry) {
    this.hasCherry = hasCherry;
  }

  /**
  *toString method overriding superclass toString method
  */
  public String toString() {
    return super.toString() + "\nHas a cherry: " + hasCherry + "\nNumber of Scoops: " + numScoops;
  }
  
}