/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author richj0985
 */
public class Candy extends DessertItem {
    
    // Instance Variables for Candy
    // Specifically the weight of the candy and the price per pound
    private double weight;
    private int pricePerLbs;

    /**
     * Constructor of Candy
     * @param name the type of candy
     * @param weight the weight of the candy
     * @param pricePerLbs the price of the candy per pound
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
        // Sets the different instance variables
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    /**
     * Method that obtains the cost of the Candy
     * @return the cost of the candy
     */
    @Override
    public int getCost(){
        // Determines the cost and then rounds it
        return (int)Math.round(this.pricePerLbs * this.weight);
    }
    
    /**
     * Method that prints out the specific text for the candy item for the receipt
     * @return the string of the information about Candy
     */
    @Override
    public String toString()
    {
        // Converts the cost of the candy to dollars
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        
        // Determines the amount of space left in the row in the receipt to place the cost
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        
        // Creates an output for this specifc food within the receipt also converting the price per pound to dollars (doesn't include the cost yet)
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb."
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
