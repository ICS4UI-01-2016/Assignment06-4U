
/**
 * The Candy class is a subclass of DessertItem. This is an important class!
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author tatad6701
 *
 */
public class Candy extends DessertItem {

    // Create instance variables to be used
    private double weight;
    private int pricePerLbs;

    /**
     * Constructor for the Candy! :)
     *
     * @param name the name of the candy being passed through
     * @param weight the weight of the candy being passed through
     * @param pricePerLbs the price per pounds of the candy being passed through
     */
    public Candy(String name, double weight, int pricePerLbs) {
        // Initializing the instance variables
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Method that gets the cost of the candy itself
     *
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        // Getting the price of the candy(s) (multiplying the weight and the pricePerLbs)
        int price = (int) (Math.round(this.weight * this.pricePerLbs));
        // Return the price of the candy(s)
        return price;
    }

    /**
     * Method that prints out the text nicely on the receipt!
     *
     * @return the output string which holds the text/information that is being
     * formatted properly
     */
    @Override
    public String toString() {
        // Create a empty string 
        String output = "";
        // Changing the cost from cents to dollars
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the space that is leftover for the cost within the receipt
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        // Printing the information on the receipt and formating the text properly for the receipt
        output += this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb." + "\n" + super.getName();
        // "%" = indicates the formatting of the receipt && "s" = indicates the amount of spaces (note to myself)
        output += String.format("%" + (widthLeft) + "s", costToDollars);

        // Return the ouput
        return output;
    }
}
