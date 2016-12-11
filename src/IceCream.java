/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author richj0985
 */
public class IceCream extends DessertItem{
    
    // Instance Variables for Ice Cream
    // Specifically the cost of the icecream
    private int cost;
    
    /**
     * Constructor of the Ice Cream
     * @param name the type of ice cream
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost)
    {
        // Sets the different instance variables
        super(name);
        this.cost = cost;
    }

    /**
     * Method that obtains the cost of the Ice Cream
     * @return the cost of the ice cream
     */
    @Override
    public int getCost(){
        return cost;
    }
    
    /**
     * Method that prints out the specific text for the ice cream item for the receipt
     * @return the string of the information about Candy
     */
    @Override
    public String toString()
    {
        // Converts the cost of the candy to dollars
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        
        // Determines the amount of spaces needed to align the item name and 
        // item cost on the right side of the receipt
        int spacingWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        
        // Creates an output for this specific food within the receipt (doesn't include the cost yet)
        String output = super.getName();
        
        // Outputs spaces to right align the cost to the right size of receipt
        for(int i = 0; i < spacingWidth; i++){
            output = output + " ";
        }
        
        // Adds the cost in the output string
        output = output + costToDollars;
        
        // Returns the fully created output
        return output;
    }
    
}
