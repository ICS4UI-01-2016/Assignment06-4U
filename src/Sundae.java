
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
/**
 * class extends to ice cream
 *
 * @author munta
 */
public class Sundae extends IceCream {
//instance variables

    private String toppingName;
    public int toppingCost;

    /**
     * pass through the name,cost ,topping name,and topping cost
     *
     * @param icName the name of the ice cream
     * @param icCost the cost of the ice cream
     * @param toppingName the name of the topping for the ice cream
     * @param toppingCost the cost of the topping for the ice cream
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;

    }

    public String toString() {
        //set first line 
        String output = this.toppingName + " Sundae " + "with\n";
        //covert the cost to dollars 
        String lengthCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - lengthCost.length() - 1;
        //add the name
        output += super.getName();
        //add the required amount of spaces 
        for (int i = 0; i <= width; i++) {
            output += " ";
        }
        //add the cost to the 2nd line
        output += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //return
        return output;

    }

    /**
     * return calculate cost of the ice cream with the topping cost included
     *
     * @return the cost of the ice cream including the topping cost
     */
    public int getCost() {
        return super.getCost() + toppingCost;
    }

}
