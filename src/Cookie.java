/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author richj0985
 */
public class Cookie extends DessertItem {
    
    // Instance Variables for Candy
    // Specifically the number of cookies bought and the price per 12
    private int number;
    private int pricePer12;
    
    /**
     * Constructor of Cookie
     * @param name the type of cookie
     * @param number the number of cookies
     * @param pricePer12 the price of the cookies per 12
     */
    public Cookie(String name, int number, int pricePer12)
    {
        // Setting the different instance varibles
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
        
    }
    
    /**
     * Method that obtains the cost of the Cookies
     * @return the cost of the cookies
     */
    @Override
    public int getCost(){
        // Determines the cost and then rounds it
        return (int)Math.round((this.number / 12.0) * this.pricePer12);
    }
    
    /**
     * Method that prints out the specific text for the cookie item for the receipt
     * @return the string of the information about Cookie
     */
    @Override
    public String toString()
    {
        // Converts the cost of the candy to dollars
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        
        // Determines the amount of space left in the row in the receipt to place the cost
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        
        // Creates an output for this specifc food within the receipt also converting the price per pound to dollars (doesn't include the cost yet)
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz"
                + "\n" + super.getName();
        
        // Ouputs out lines to space the information from the cost
        for(int i = 0; i < screenWidth; i++){
            output = output + " ";
        }
        
        // Adds the cost in the output string
        output = output + costToDollars;
        
        // Returns the fully created output
        return output;
    }
    
}
