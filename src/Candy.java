
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
        // Changing the cost from cents to dollars 
        String changedToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the amount of space that is left by subtracting the name and cost's length
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - changedToDollars.length();
        // Printing out the information for the receipt
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerlibs) + " /lb. \n"
                + super.getName();
        // Properly printing out the output (info for the receipt) and the spaces
        for (int i = 0; i < widthLeft; i++) {
            output = output + " ";
        }
        // Printing out the output, the spaces, and the cost of the specific candy
        output = output + changedToDollars;
        // Return the ouput
        return output;
    }
}
