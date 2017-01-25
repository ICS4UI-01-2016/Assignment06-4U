
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author Brayden
 */
public class IceCream extends DessertItem {

    //instance variable for cost
    private final int cost;

    public IceCream(String name, int cost) {
        
        //assign the variables
        super(name);
        this.cost = cost;
        
    }
    /**
     * return the information as a string
     * @return the information as a string
     */
    @Override
    public String toString() {
        //create an integer for the width of the receipt
        int width = DessertShoppe.RECEIPT_WIDTH;
        //create an int for the amount of blank space infront of the price
        int widthIce = width - (super.getName()).length();

        //get all of the information needed to output for the given sundae
        String output = super.getName();
        String icCost = DessertShoppe.cents2dollarsAndCents(this.getCost()); //get the cost of the sundae in the proper format
        output += String.format("%" + widthIce + "s", icCost); // turn all of the information into a printable string

        //return the string
        return output;
    }

    /**
     * return the price 
     * @return the price
     */
    @Override
    public int getCost() {
        int price = (int) Math.round(this.cost);
        return  price;

    }
}
