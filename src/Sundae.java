
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

    //variables that represent the name and cost of the toppings
    String toppingName;
    int toppingCost;

    /**
     * Sundae constructor holds all information about the sundae
     * @param icName the name of the sundae
     * @param icCost cost of the sundae
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * Turns sundae information to strings
     * @return returns topping name, ice cream name with proper formatting
     */
    public String toString() {
        String spaces = new String();
        int space = 30 - (this.icName.length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        for(int i = 0; i < space; i++){
            spaces = spaces + " ";
        }
        return (this.toppingName + " Sundae" + " With/n" + this.icName + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    /**
     * Cost of sundaes
     * @return returns cost of sundaes and toppings
     */
    @Override
    public int getCost(){
        return (int) super.getCost() + toppingCost;
    }
}
