
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author khaled
 */
public class IceCream extends DessertItem {

    private int cost;

    public IceCream(String name, int cost) {
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
        //converts the cost of the ice cream with topping and converts it to string
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int numberOfSpaces = 30 - super.getName().length() - output.length();
        for (int i = 0; i < numberOfSpaces; i++) {
            output = " " + output;
        }
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
