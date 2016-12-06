
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    //instance variables
    private int cost;

    /**
     * constructor method for icecream
     *
     * @param name the name of the ice cream
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost) {
        //pass in name and cost
        super(name);
        this.cost = cost;

    }

    /**
     * accessor method to get the cost of the ice cream
     *
     * @return the cost
     */
    @Override
    public int getCost() {
        //return the cost;
        return this.cost;
    }

    /**
     * toString method to print out an icecreams parameters
     *
     * @return the created icecreams parameters as a string
     */
    @Override
    public String toString() {
        //width of recipt in spaces
        int width = DessertShoppe.RECEIPT_WIDTH;
        //the cost as a string 
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the remaining spaces after subtracting the length of the name of the icecream
        int rSpaces = width - super.getName().length();
        //creating an output string with the same format as the example recipt
        String output = super.getName();
        //format the space between the calculated price with the spaces and add it to the output string
        output += String.format("%" + rSpaces + "s%n", cost);
        //return output
        return output;
    }
}
