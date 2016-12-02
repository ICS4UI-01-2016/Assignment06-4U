
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
        // Getting the length of the cost
        String changedToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Adding the correct amount of spaces
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - changedToDollars.length();
        String output = super.getName();
        // Porperly printing the spaces
        for (int i = 0; i < widthLeft; i++) {
            output = output + " ";
        }
        output = output + changedToDollars;
        return output;
    }
}
