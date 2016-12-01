
/**
 * The Candy class is a subclass of DessertItem. This is an important class!
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author
 * @tatad6701
 */
public class Candy extends DessertItem {

    // Create instance variables to be used
    private double weight;
    private int pricePerlibs;

    /**
     * Constructor for the Candy
     *
     * @param name the name of the candy being passed through
     * @param weight the weight of the candy being passed through
     * @param pricePerLbs the price per pounds of the candy being passed through
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerlibs = pricePerLbs;
    }

    /**
     * Method that gets the cost of the candy itself
     *
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        int price = (int) (Math.round(this.weight * this.pricePerlibs));
        return price;
    }

    /**
     * Method that prints out the text nicely!
     *
     * @return the output string which holds the text that is formatting
     * properly
     */
    @Override
    public String toString() {
        // Adding the correct amount of spaces
        String output = this.weight + " lbs. @ $" + this.pricePerlibs + " /lb." + "\n"
                + super.getName();
        DessertShoppe.RECEIPT_WIDTH - 27;
        return output;
    }
}
