
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
 * @author Thomas
 */
//a sundae is icecream with a topping (subclass of icecream)
public class Sundae extends IceCream {

    //variables for class
    private int toppingCost;
    private String toppName;
    private int icCost;

    //constructor takes the icecream name and cost, also takes topping name and cost
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //sends name and cost of icecream to icecream
        super(icName, icCost);
        //assign variables
        this.icCost = icCost;
        this.toppName = toppingName;
        this.toppingCost = toppingCost;
    }

    @Override
    //method prints information to 'reciept' in proper format
    public String toString() {
        //convert from cents to dollars and convert the number to a stringg
        String costDollars = DessertShoppe.cents2dollarsAndCents(getCost());
        //calculate number of spaces that need to be added to get proper format
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costDollars.length();

        String output = this.toppName + " Sundae with \n"
                + super.getName();
        //add appropriate number of spaces between name and cost
        for (int i = 0; i < width; i++) {
            output += " ";
        }
        //add cost to end
        output += costDollars;
        //return output
        return output;
    }

    @Override
    //calculate cost of sundae
    public int getCost() {
        //add icecream cost(calculateed by icecream) to topping cost
        return super.getCost() + toppingCost;
    }

}
