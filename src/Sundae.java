
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author guanv6321
 */
public class Sundae extends IceCream{

    // instance variables to store the topping name and cost
    private String toppingName;
    private int toppingCost;
    
    /**
     * constructor to initialize instance variables
     * @param name of the topping
     * @param cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * gets the name of the topping
     * @return the cost of the topping
     */
    public String getToppingName(){
        return this.toppingName;
    }
    
    /**
     * gets the cost of the topping
     * @return the cost of the topping
     */
    public int getToppingCost(){
        return this.toppingCost;
    }
    
    /**
     * method used to calculate total cost 
     * @return total cost of the sundae
     */
    @Override
    public int getCost(){
       // adds ice cream and topping cost 
       int cost = super.getCost() + this.toppingCost;
       return cost;
    }
    
    /**
     * represents information about the sundae in a string
     * @return the name of topping, name of ice cream, and the total cost
     */
    @Override
    public String toString() {
        // converts cents to dollars
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // converts cost of candy into a string
        String costLength = "" + this.getCost();
        //calculates the amount of spaces between the cost and name of ice cream
        int spaces = 30 - super.getName().length() - costLength.length()-1;
        // for loop used to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            output = " " + output;
        }      
        return this.toppingName + " Sundae with \n" + super.getName() + output;
    }
}
