
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    // instance variables
    private int cost;

    /**
     * Constructor for IceCream
     *
     * @param name of the ice cream
     * @param cost of the ice cream
     */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    /**
     * Gets the cost of the ice cream
     *
     * @return the cost of the ice cream
     */
    @Override
    public int getCost() {
        return this.cost;
    }

    /**
     * Converts the name and cost of the ice cream to a string and formats it to
     * fit the receipt
     *
     * @return the name and cost of the ice cream
     */
    @Override
    public String toString() {
        // string to get the length of the output without spaces
        String length = this.getName() + DessertShoppe.cents2dollarsAndCents(this.getCost());
        // number of spaces needed
        int numSpaces = DessertShoppe.RECEIPT_WIDTH - length.length();
        // variable to add spaces to
        String spaces = "";
        // loop to add the spaces
        for (int i = 0; i < numSpaces; i++) {
            spaces = spaces + " ";
        }
        // outputs everything
        String output = this.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
}
