
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound.
 * The weight and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    // instance variables
    private double weight;
    private int pricePerLbs;

    /**
     * Constructor for Candy
     *
     * @param name name of the candy
     * @param weight weight of the candy
     * @param pricePerLbs price per lbs of candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Gets the weight of the candy
     *
     * @return the weight of the candy
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets the price per lbs of candy
     *
     * @return the price per lbs of candy
     */
    public int getPricePerLbs() {
        return this.pricePerLbs;
    }

    /**
     * Gets the cost of the candy
     *
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        return (int) (Math.round(this.getPricePerLbs() * this.getWeight()));
    }

    /**
     * Converts the name and cost of the ice cream to a string and formats it to
     * fit the receipt
     *
     * @return the weight of the candy, the price per lbs of candy, the name of
     * the candy, and the cost of the candy
     */
    @Override
    public String toString() {
        // string to get the length of the output without spaces
        String length = this.getName() + DessertShoppe.cents2dollarsAndCents(this.getCost());
        // number of spaces needed
        int numSpaces = DessertShoppe.RECEIPT_WIDTH - length.length();
        // variable to add spaces to
        String spaces = "";
        // loop to add the spaces
        for (int i = 0; i < numSpaces; i++) {
            spaces = spaces + " ";
        }
        // outputs everything
        String output = this.getWeight() + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.getPricePerLbs()) + " /lb.\n" + this.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
}
