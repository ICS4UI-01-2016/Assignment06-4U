
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
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream {

    // instance variables
    private String toppingName;
    private int toppingCost;

    /**
     * Constructor for Sundae
     *
     * @param icName name of the ice cream
     * @param icCost cost of the ice cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * Method to get the topping name
     *
     * @return the topping name
     */
    public String getToppingName() {
        return this.toppingName;
    }

    /**
     * Method to get the cost of the topping
     *
     * @return the cost of the topping
     */
    public int getToppingCost() {
        return this.toppingCost;
    }

    /**
     * Method to get the cost of the sundae
     *
     * @return the cost of the sundae
     */
    @Override
    public int getCost() {
        return this.getToppingCost() + super.getCost();
    }

    /**
     * Converts the topping name, name of the ice cream and cost of the sundae
     * to a string and formats it to fit the receipt
     *
     * @return the topping name, name of the ice cream, and the cost
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
        String output = this.getToppingName() + " sundae with\n" + this.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }

}
