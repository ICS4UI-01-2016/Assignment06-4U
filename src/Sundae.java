/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author Khaled
 */
public class Sundae extends IceCream{
    //instance private variable used to save the name of the topping
    private String toppingName;
    //instance private variable used to save the cost of the topping in cents
    private int toppingCost;

   /**
    * The constructor for initializing variables such as cost and names
    * @param icName the name of the ice cream borrowed from the upper (master) class
    * @param icCost the cost of the ice cream borrowed from the upper (master) class
    * @param toppingName the name of the topping 
    * @param toppingCost the cost of the topping in cents
    */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        //takes the super's class' name and cost of the ice cream
       super(icName,icCost);
       
       //initializes both the topping cost and topping name 
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
    }
    
    /**
     * A getter, gets the cost of the topping when called
     * @return the cost of the topping 
     */
    public int getToppingCost(){
        return toppingCost;
        
    }
    /**
     * A getter, gets the name of the topping when called
     * @return the name of the topping 
     */
    public String toppingName(){
        return toppingName;
    }
    

    /**
     * Returns a string representation of the object which in this case it's sundae (ice cream)
     * @return the name of the topping as well as the name of the ice cream
     */
    @Override
    public String toString()
    {
        //converts the cost of the ice cream with topping and converts it to string
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculates the amount of spaces between the cost of ice cream and the item name 
        int numberOfSpaces = 30 - super.getName().length() - output.length();
        // for loop used to print out the exact amount of calculated spaces 
        for (int i = 0; i < numberOfSpaces; i++) {
            output = " " + output;
        }
        //returns the name of the topping and the name of the ice cream as well as the cost 
        return this.toppingName+ " Sundae with \n"  + super.getName() +   output;
        
        
    }
    
    /**
     * a method to calculate the total cost of the sundae 
     * @return the total cost of the sundae
     */
    public int getCost(){
        int cost = super.getCost() + this.toppingCost;
        return cost;
    }
    
   
    
}
