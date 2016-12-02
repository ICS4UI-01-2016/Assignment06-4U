
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author coulh9904
 */
public class Cookie extends DessertItem {

    private int pricePer12;
    private int number;
    private String name;
    //A constructor for the Cookies (which accepts all the necessary variables)
    public Cookie(String name, int number, int pricePer12) {
        this.name = name;
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Displays the item information.
     *
     * @return the items name, cost, etc, to be printed on receipt
     */
    public String toString() {
        String output = this.number + " @ "
                + this.pricePer12 + "/dz" + "\n" + this.name + FindLength() + getCost() * 0.01;
        return output;
    }

    @Override
    /**
     * Calculates the final cost of the item(s)
     *
     * @return the cost
     */
    public int getCost() {
        double Cost = pricePer12 / 12f;
        int TotalCost = (int) Math.round(Cost * number);
        return TotalCost;
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
