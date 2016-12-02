
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author coulh9904
 */
public class IceCream extends DessertItem {

    private String name;
    private int cost;
    //A constructor for the IceCream (which accepts all the necessary variables)
    public IceCream(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Displays the item information.
     *
     * @return the items name, cost, etc, to be printed on receipt
     */
    public String toString() {
        String output = this.name
                + FindLength() + getCost() * 0.01;
        return output;
    }

    public String sendName() {
        return name;
    }

    /**
     * Calculates the final cost of the item(s)
     *
     * @return the cost
     */
    @Override
    public int getCost() {
        return cost;
    }

    /**
     * Calculates how much space will need to be left between the names and the
     * cost (to get a width of 30)
     *
     * @return the number of necessary spaces int SpacesT - represents the
     * spaces taken (out of the 30) String Spacing - Spacing will be the array
     * to hold enough spaces to fill the sting and get the full width of 30.
     */
    public String FindLength() {

        int SpacesT = this.name.length() + String.valueOf(getCost()).length();
        String Spacing = "";
        while ((30 - SpacesT) > 0) {
            Spacing = Spacing + " ";
            SpacesT++;
        }

        return Spacing;
    }
}
