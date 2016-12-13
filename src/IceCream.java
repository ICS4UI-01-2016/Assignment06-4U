
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {
    //cost of the ice cream
    private int cost;

    public IceCream(String name, int cost) {
        //calls the super class for the name
        super(name);
        this.cost = cost;
    }

    /**
     * Gets and returns the cost of ice cream
     * @return 
     */
    @Override
    public int getCost() {
        return (cost);
    }

    /**
     * Prints ice cream, and it's cost
     * @return ice cream and its cost
     */
    @Override
    public String toString() {
        //converts the cent amount to dollars
        String length = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //gets spaces between name and price
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - length.length();
        //prints name
        String output = super.getName();
        //prints the spaces
        for (int i = 0; i < width; i++) {
            output += " ";

        }
        output += length;
        return output;


    }
}