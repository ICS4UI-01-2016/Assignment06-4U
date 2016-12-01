
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
        String output = this.getName();
        int space = DessertShoppe.RECEIPT_WIDTH;
        output = output + space + cost;
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
