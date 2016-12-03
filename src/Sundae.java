
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream {

    //instance variables

    private String toppingName;
    private int toppingCost;

    /**
     * constructor method for sundae
     *
     * @param icName the name of the ice cream
     * @param icCost the cost of the ice cream
     * @param toppingName the name of the topping
     * @param toppingCost the cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //pass in ice cream name, ice cream cost, topping name and topping cost
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * accessor method to get the cost of the sundae
     *
     * @return cost of sundae
     */
    @Override
    public int getCost() {
        //return the cost of the ice cream plus the cost of the topping
        return super.getCost() + toppingCost;
    }

    /**
     * toString method to print out sundaes parameters
     * @return the created sundaes parameters as a string
     */
    @Override
    public String toString() {
        //width of recipt in spaces
        int width = DessertShoppe.RECEIPT_WIDTH;
        //the cost as a string 
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the remaining spaces after subtracting the length of the name of the sundae
        int rSpaces = width - super.getName().length();
        //creating an output string with the same format as the example recipt
        String output = toppingName + " Sundae with\n" + super.getName();
        //format the space between the calculated price with the spaces and add it to the output string
        output += String.format("%" + rSpaces + "s%n", cost);
        //return output
        return output;
    }

}
