
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
    //name of the type of ice cream
    private String icName;
    //cost of the type of ice cream
    private int icCost;
    //topping name
    private String toppingName;
    //topping cost
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //calls the super for the name and cost of specific types of ice cream
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        //prints the topping name and the sundae
        String output = this.toppingName + " Sundae " + " with \n";
        //converts cent amount to dollards
        String length = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //gets the spaces between name and price
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - length.length();
        //prints the name of the sundae
        output += super.getName();
        //prints the spaces
        for (int i = 0; i < width; i++) {
            output += " ";

        }
        output += length;
        return output;

    }

    //gets the cost of the certain type of sundae
    @Override
    public int getCost() {
        return super.getCost() + toppingCost;
    }
}
