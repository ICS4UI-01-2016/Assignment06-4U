
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
/**
 * class extends to dessert item
 *
 * @author munta
 */
public class IceCream extends DessertItem {
//instance varibales 

    private int cost;

    /**
     * pass through the name and the cost of the icecreamm
     *
     * @param name name of ice cream
     * @param cost cost of ice cream
     */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    /**
     *  * print outs the final output,in proper format
     *
     * @return the final output
     */
    public String toString() {
        //convert the cost to dollars
        String lengthCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - lengthCost.length() - 1;
        //set the name
        String output = super.getName();
        //add the required amount of spaces
        for (int i = 0; i <= width; i++) {
            output += " ";
        }
        //add the price 
        output += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //return
        return output;

    }

    /**
     * calculate the cost of the ice cream
     *
     * @return the cost of the ice cream
     */
    public int getCost() {
        return cost;
    }

}
