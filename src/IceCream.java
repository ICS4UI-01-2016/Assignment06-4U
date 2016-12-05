
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author tatad6701
 *
 */
public class IceCream extends DessertItem {

    // Create the instance variables to be used
    private int cost;

    /**
     * Constructor for the ice cream!
     *
     * @param name of the ice cream
     * @param cost of the ice cream
     */
    public IceCream(String name, int cost) {
        // Initializing the instance variable
        super(name);
        this.cost = cost;
    }

    /**
     * Method that gets the cost of the ice cream
     *
     * @return the cost of the ice cream
     */
    @Override
    public int getCost() {
        // Return the cost of the ice cream
        return cost;
    }

    /**
     * Method that properly and nicely prints the text concerning the ice cream
     *
     * @return the output string which holds the text that is being formatted
     * properly
     */
    public String toString() {
        // Create a empty string 
        String output = "";
        // Changing the cost from cents to dollars
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the space that is leftover for the cost within the receipt
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        // Printing the information on the receipt and formating the text properly for the receipt 
        output += super.getName();
        // "%" = indicates the formatting of the receipt && "s" = indicates the amount of spaces (note to myself)
        output += String.format("%" + (widthLeft) + "s", costToDollars);

        // Return the output
        return output;
    }
}
