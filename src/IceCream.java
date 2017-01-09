
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author guanv6321
 */
public class IceCream extends DessertItem{

    // instance variables to store the cost of the ice cream
    private int cost;
    
    /**
     * constructor to initialize instance variables
     * @param name of the ice cream
     * @param cost of the ice cream
     */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    /**
     * gets the cost of the ice cream
     * @return the cost of the ice cream
     */
    @Override
    public int getCost(){
        return this.cost;
    }
    
    /**
     * represents information about the ice cream in a string
     * @return the name and cost of the ice cream
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
        return super.getName() + output;
    }
}
