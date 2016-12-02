
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

    private String toppingName;
    public int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;

    }

    public String toString() {

        String output = this.toppingName + " Sundae " + "with\n";
        //store length of cost 
        String lengthCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - lengthCost.length()-1;
        //add the name
        output += super.getName();
        //add the required amount of spaces 
        for (int i = 0; i <= width; i++) {
            output += " ";
        }
        //add the cost
        output += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //rerturn
        return output;

    }

    public int getCost() {
        return super.getCost() + toppingCost;
    }

}
