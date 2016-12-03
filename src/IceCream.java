
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author
 * @tatad6701
 */
public class IceCream extends DessertItem {

    // Create the instance variables to be used
    private int cost;

    /**
     * Constructor for the ice cream
     *
     * @param name of the ice cream
     * @param cost of the ice cream
     */
    public IceCream(String name, int cost) {
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
        return cost;
    }

    /**
     * Method that properly prints the text concerning ice cream nicely
     *
     * @return output which contains the valuable
     */
    public String toString() {
        // Changing the cost from cents to dollars
        String changedToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the space that is leftover 
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - changedToDollars.length();
        // Printing out the information for the receipt
        String output = super.getName();
        // Properly printing out the output (info for the receipt) and the spaces
        for (int i = 0; i < widthLeft; i++) {
            output = output + " ";
        }
        // Printing out the output, the spaces, and the cost of the specific ice cream
        output = output + changedToDollars;
        // Return the output
        return output;
    }
}
