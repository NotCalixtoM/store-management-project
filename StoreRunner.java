import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    
    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    //Asks user what product they would like
System.out.println("Hello, welcome to the Ice Cream Shop, what could I get for you?\n1. Ice Cream Sandwich\n2. Ice Cream Sundae");
    int choice = input.nextInt();

   //If user chooses product 1 
    if(choice == 1) {
      System.out.println("What type of cookie would you like?\n1. Snickerdoodle\n2. Chocolate Chip");
      choice = input.nextInt();
      if(choice == 1) {
        IceCreamSandwich Snickerdoodle = new IceCreamSandwich("Snickerdoodle");
        System.out.println("Here's your ice cream sandwich: \n" + Snickerdoodle);
      } else {
        IceCreamSandwich Chocolate = new IceCreamSandwich("Chocolate Chip");
        System.out.println("Here's your ice cream sandwich: \n" + Chocolate);
      }

    } else {
      System.out.println("How many scoops would you like?\n1. 1\n2. 2\n3. 3");
      choice = input.nextInt();
        IceCreamSundae p = new IceCreamSundae(choice);
      System.out.println("Here's your ice cream sandwich: \n" + p);
    }
    
    // Closes the Scanner object
    input.close();
    
  }
}