
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

    private int icCost;
    private String icName;
    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public int getCost() {
        return this.icCost;
    }

    public String toString() {
        String output = this.toppingName + " Sundae with \n" + this.getName();


        //spaces available
        int width = DessertShoppe.RECEIPT_WIDTH;
        int outputLength = this.getName().length();
        //finding length of output
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        outputLength = outputLength + costLength;
        //find the remaining space between total space and used up space from strings
        int space = width - outputLength;
        for (int i = 0; i < space; i++) {
            output = output + " ";
        }
        output = output + (DessertShoppe.cents2dollarsAndCents(this.getCost()) + this.toppingCost);
        return output;
    }
}
