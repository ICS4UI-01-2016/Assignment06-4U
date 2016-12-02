
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author coulh9904
 */
public class Candy extends DessertItem {

    private String name;
    private double weight;
    private int pricePerLbs;
    //A constructor for the Candy (which accepts all the necessary variables)
    public Candy(String name, double weight, int pricePerLbs) {
        this.name = name;
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Displays the item information.
     *
     * @return the items name, cost, etc, to be printed on receipt
     */
    public String toString() {
        String output = this.weight + "lbs @ "
                + this.pricePerLbs + "/lb." + "\n" + this.name + FindLength() + getCost() * 0.01;

        return output;
    }

    /**
     * Literally just returns the kind of ice cream for reference in Sundae
     *
     * @return the name of the ice cream
     */
    public String getStuff() {
        return name;
    }

    /**
     * Calculates the final cost of the item(s)
     *
     * @return the cost
     */
    public int getCost() {
        double TotalCost = (weight * pricePerLbs);
        return (int) Math.round(TotalCost);
    }

    /**
     * Calculates how much space will need to be left between the names and the
     * cost (to get a width of 30)
     *
     * @return the number of necessary spaces (int SpacesT - represents the
     * spaces taken (out of the 30)) (String Spacing - Spacing will be the array
     * to hold enough spaces to fill the sting and get the full width of 30.)
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
