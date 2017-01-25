
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
 * @author Brayden
 */
public class Sundae extends IceCream {

    //instance variables
    private String toppingName;
    private int toppingCost;

    /**
     * constructor
     *
     * @param icName name of the ice cream
     * @param icCost cost of the ice cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        //call the name and cost of the icecream from the super class icecream
        super(icName, icCost);
        //assign the following variables
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;

    }

    /**
     * return the information as a string
     *
     * @return the information as a string
     */
    @Override
    public String toString() {
        //create an integer for the width of the receipt
        int width = DessertShoppe.RECEIPT_WIDTH;
        //create an int for the amount of blank space infront of the price
        int widthSun = width - (super.getName()).length();

        //get all of the information needed to output for the given sundae
        String output = this.toppingName + " Sundae with \n" + super.getName();
        String sundCost = DessertShoppe.cents2dollarsAndCents(this.getCost()); //get the cost of the sundae in the proper format
        output += String.format("%" + widthSun + "s", sundCost); // turn all of the information into a printable string

        //return the string
        return output;
    }

    /**
     * return the cost
     * @return the cost
     */
    @Override
    public int getCost() {
        return super.getCost() + this.toppingCost;
    }

}
