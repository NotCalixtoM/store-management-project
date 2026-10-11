public class IceCreamSandwich extends IceCream {

private String cookieType;
private boolean cookieIsWarm;

  /**
  *No-Argument Constructor
  */ 
  public IceCreamSandwich() {
    super("Ice Cream Sandwich", 6.99);
    cookieType = "Chocolate Chip";
  }
  
  /**
  *Parameterized Constructor, sets cookieType
  */
  public IceCreamSandwich(String cookieType) {
    super("Ice Cream Sandwich", 6.99);
    this.cookieType = cookieType;
  }
  
  /**
  *Parameterized Constructor, sets cookieType and cookieIsWarm
  */
  public IceCreamSandwich(String cookieType, boolean cookieIsWarm) {
    super("Ice Cream Sandwich", 6.99);
    this.cookieType = cookieType;
    this.cookieIsWarm = cookieIsWarm;
    if (cookieIsWarm == true) {
      super.setPrice(7.99);
    }
  }

  /**
  *Accessor method for cookieType
  */
  public String getCookieType() {
    return cookieType;
  }

  /**
  *Mutator method for cookieType
  */
  public void setCookieType(String cookieType) {
    this.cookieType = cookieType;
  }
  
  /**
  *Accessor method for cookieIsWarm
  */
  public boolean getCookieIsWarm() {
    return cookieIsWarm;
  }

  /**
  *Mutator method for cookieIsWarm
  */
  public void setCookieIsWarm(boolean cookieIsWarm) {
    this.cookieIsWarm = cookieIsWarm;
  }

  /**
  *toString method overriding superclass toString method
  */
  public String toString() {
    return super.toString() + "\nCookie Type: " + cookieType + "\nIs it warm: " + cookieIsWarm;
  }


}