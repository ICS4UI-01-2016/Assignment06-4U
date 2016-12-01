
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author
 * @tatad6701
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
        return (super.getCost() + toppingCost);
    }

    /**
     * Method that properly prints the text concerning sundae nicely
     *
     * @return
     */
    @Override
    public String toString() {
        String output = this.toppingName + " Sundae with" + "\n"
                + super.getName() + this.getCost();
        return output;
    }
}
