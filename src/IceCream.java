
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author sevcm7279
 */
public class IceCream extends DessertItem {

    private int cost;

    /**
     * constructor to create the ice cream
     *
     * @param name
     * @param cost
     */
    public IceCream(String name, int cost) {
        // get the name for the Dessertitem class
        super(name);
        this.cost = cost;
    }

    public String toString() {
        // convert cost to dollars
        double cost = ((this.cost)/100.00);
  
        // create output and add the name
        String output = this.getName(); 
        // determine the number of spaces the name takes up
        int nLength = (super.getName()).length();
        // make the cost into a string
        String cost2 = Double.toString(cost);
        // determine the number of spaces the price takes up
        int pLength = cost2.length();
        int width = DessertShoppe.RECEIPT_WIDTH;
        
        // determine the space needed between the name and cost
        int space = width - (nLength + pLength);
        
        for (int i = 0; i < space; i++) {
            // add the spaces to the output
            output += " ";
        }
        // add the cost to the output
        output += cost2;
        return output;
    }

    /**
     * returns the cost of the ice cream
     * @return the cost of the ice cream
     */
    @Override
    public int getCost() {
        return cost;
    }
}
