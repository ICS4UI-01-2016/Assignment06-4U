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
 * @author richj0985
 */
public class Sundae extends IceCream{
    
    // Instance Variables for Sundae
    // Specifically the topping name and the topping cost for the sundae
    private String toppingName;
    private int toppingCost;
    
    /**
     * Constructor of Sundae
     * @param icName the ice cream name
     * @param icCost the cost of the ice cream
     * @param toppingName the topping name
     * @param toppingCost the cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        // Sets the different instance variables
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }
    
    /**
     * Method that obtains the cost of the Sundae
     * @return the cost of the sundae
     */
    @Override
    public int getCost(){
        return super.getCost() + this.toppingCost;
    }
    
    /**
     * Method that prints out the specific text for the sundae item for the receipt
     * @return the string of the information about Sundae
     */
    @Override
    public String toString()
    {
        // Converts the cost of the candy to dollars
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        
        // Determines the amount of space left in the row in the receipt to place the cost
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        
        // Creates an output for this specifc food within the receipt (doesn't include the cost yet)
        String output = this.toppingName + " Sundae with" + "\n"
                + super.getName();
        
        // Ouputs out lines to space the information from the cost
        for(int i = 0; i < screenWidth; i++){
            output = output + " ";
        }
        
        // Ouputs out lines to space the information from the cost
        output = output + costToDollars;
        
        // Returns the fully created output
        return output;
    }
    
}
