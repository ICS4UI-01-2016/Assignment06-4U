
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author coulh9904
 */
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;
    private String icName;
    private int icCost;
    //A constructor for the Sundae (which accepts all the necessary variables)
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * Displays the item information.
     *
     * @return the items name, cost, etc, to be printed on receipt
     */
    public String toString() {
        String output = this.toppingName + " Sundae with "
                + "\n" + super.sendName() + FindLength() + getCost() * 0.01;
        return output;
    }

    @Override
    /**
     * Calculates the final cost of the item(s)
     *
     * @return the cost
     */
    public int getCost() {
        int TotalCost = super.getCost() + toppingCost;
        return TotalCost;
    }

    /**
     * Calculates how much space will need to be left between the names and the
     * cost (to get a width of 30)
     *
     * @return the number of necessary spaces int SpacesT - represents the
     * spaces taken (out of the 30) String Spacing - Spacing will be the array
     * to hold enough spaces to fill the sting and get the full width of 30.
     */
    public String FindLength() {

        int SpacesT = super.sendName().length() + String.valueOf(toppingCost * 0.01).length();

        String Spacing = "";
        while ((30 - SpacesT) > 0) {
            Spacing = Spacing + " ";
            SpacesT++;
        }

        return Spacing;
    }
}
