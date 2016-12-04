
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author tatad6701
 *
 */
public class Sundae extends IceCream {

    // Create the instance varaibles
    private String toppingName;
    private int toppingCost;

    /**
     * Constructor for the the sundae
     *
     * @param icName the name of the ice cream being passed through
     * @param icCost the cost of the ice cream being passed through
     * @param toppingName the topping name being passed through
     * @param toppingCost the topping cost being passed through
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        // Initializing the instance variables
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * Method that gets the cost of the sundae with toppings included
     *
     * @return the cost of the ice cream (sundae) plus the cost of the toppings
     */
    public int getCost() {
        // return the cost of the ice cream (sundae) plus the cost of the toppings
        return (super.getCost() + toppingCost);
    }

    /**
     * Method that properly and nicely prints the text concerning the sundae
     *
     * @return the output string which holds the text that is being formatted
     * properly
     */
    @Override
    public String toString() {
        // Create a empty string 
        String output = "";
        // Changing the cost from cents to dollars
        String changedToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the space that is leftover 
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        // Printing the information on the receipt and formating the text properly for the receipt
        output += this.toppingName + " Sundae with" + "\n" + super.getName();
        // "%" = indicates the formatting of the receipt && "s" = indicates the amount of spaces (note to myself)
        output += String.format("%" + (widthLeft) + "s", changedToDollars);

        // Return the ouput
        return output;
    }
}
