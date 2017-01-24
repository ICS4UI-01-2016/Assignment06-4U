
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author khaled
 */
public class IceCream extends DessertItem {

    //private instance used to store the cost of ice cream
    private int cost;

    /**
     * A constructor used to initialize the name and cost of ice cream
     * @param name of the ice cream
     * @param cost of the ice cream 
     */
    public IceCream(String name, int cost) {
        //takes the super's class' name and cost of the ice cream
        super(name);
        this.cost = cost;
    }

    /**
     * Returns a string representation of the object which in this case it's the
     * ice cream
     *
     * @return the name of the ice cream as well as the name of the price of how
     * much it costs
     */
    @Override
    public String toString() {
        //converts the cost of the ice cream and converts it to string
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculates the amount of spaces between the cost of ice cream and the item name 
        int numberOfSpaces = 30 - super.getName().length() - output.length();
         // for loop used to print out the exact amount of calculated spaces 
        for (int i = 0; i < numberOfSpaces; i++) {
            output = " " + output;
        }
         //returns the name of the ice cream as well as the cost that is converted to string
        return super.getName() + output;

    }

    /**
     * a method to calculate the total cost of the ice cream
     *
     * @return the total cost of the ice cream
     */
    @Override
    public int getCost() {

        return this.cost;
    }

}
