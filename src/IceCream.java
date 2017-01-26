
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author kulla6503
 */
public class IceCream extends DessertItem {

    // Creating a instance variable to store the the cost of the ice cream
    private int cost;

    /**
     * Creating a constructor to initialize the instance variables
     *
     * @param name of the ice cream
     * @param cost of the ice cream
     */
    public IceCream(String name, int cost) {

        // The super class name is taken 
        super(name);

        // Initializing the cost of the ice cream 
        this.cost = cost;
    }

    /**
     * Gets the cost of the ice cream
     *
     * @return the cost of the ice cream
     */
    @Override
    public int getCost() {
        return this.cost;
    }

    /**
     * The string contains information of the ice cream
     *
     * @return the name and cost of the ice cream
     */
    @Override
    public String toString() {

        // The currency of cents is converted to dollars 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());

        // The cost of icecream is converted to a string 
        String costLength = "" + this.getCost();

        // Calculates the number of spaces between the cost of the ice cream and the ice cream name
        int numberofspaces = 30 - super.getName().length() - costLength.length() - 1;

        // For loop created and used to print out the exact number of calculated spaces
        for (int i = 0; i < numberofspaces; i++) {
            output = " " + output;
        }

        // Returns the name 
        return super.getName() + output;
    }
}
