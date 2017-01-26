
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author kulla6503
 */
public class Sundae extends IceCream {

    // Creating a instance variable to store the the topping name 
    private String toppingName;
    
    // Creating a instance variable to store the the topping cost 
    private int toppingCost;

    /**
     * Creating a constructor to initialize the instance variables
     *
     * @param name of the topping
     * @param cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        // Super class name is taken, which is ice cream name and cost 
        super(icName, icCost);

        // Initializes the name of the topping 
        this.toppingName = toppingName;
        
        // Initializes the cost of the topping 
        this.toppingCost = toppingCost;
    }

    /**
     * Gets the name of the topping
     *
     * @return the cost of the topping
     */
    public String getToppingName() {
        return this.toppingName;
    }

    /**
     * Gets the cost of the topping
     *
     * @return the cost of the topping
     */
    public int getToppingCost() {
        return this.toppingCost;
    }

    /**
     * Method used to calculate total cost of the sundae
     *
     * @return total cost of the sundae
     */
    @Override
    public int getCost() {

        // The cost of ice cream and topping is added 
        int cost = super.getCost() + this.toppingCost;
        return cost;
    }

    /**
     * The string contains information of the Sundae
     *
     * @return the name of topping, name of ice cream, and the total cost
     */
    @Override
    public String toString() {

        // The currency of cents is converted to dollars 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());

        // The cost of sundae is converted to a string 
        String costLength = "" + this.getCost();

        // Calculates the number of spaces between the cost of the sundae and the sundae name
        int numberofspaces = 30 - super.getName().length() - costLength.length() - 1;

        // For loop created and used to print out the exact number of calculated spaces
        for (int i = 0; i < numberofspaces; i++) {
            output = " " + output;
        }

        // Returns the name of the topping, the name and cost of ice cream
        return this.toppingName + " Sundae with \n" + super.getName() + output;
    }
}
