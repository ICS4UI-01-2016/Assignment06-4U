
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author laurelizall
 */
public class Sundae extends IceCream {

    private String icName;
    private int icCost;
    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        // grab name and cost of base ice cream for sundae
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public String toString() {
        String output = this.toppingName + " Sundae with" + "\n";
        output = output + this.getName();
        // how many spaces
        int width = DessertShoppe.RECEIPT_WIDTH;
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        // name + cost length
        int outputLength = this.getName().length() + costLength;
        
        // add costLength to the outputLength
        int remainingSpace = width - outputLength;
        
        // insert enough spaces to make the layout equal
        for (int i = 0; i < remainingSpace; i++) {
            output = output + " ";
        }
        output = output + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
    
    @Override
    public int getCost() {
        return (super.getCost() + toppingCost);
    }
    
}
