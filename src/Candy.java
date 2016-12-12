
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    //weight of the candy
    private double weight;
    //price per pound
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        //call the super class
        super(name);
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;
    }

    /**
     * Gets the cost of the candy
     *
     * @return the price of the candy
     */
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }

    /**
     * Prints the names and prices of candy
     *
     * @return spaces
     */
    @Override
    public String toString() {
        //converts the cent amount to dollars
        String length = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //get how many spaces between name and price
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - length.length();
        //constructing the order that things are printed
        String output = this.weight + "lbs. @ " + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb. \n" + super.getName();
        //prints the spaces
        for (int i = 0; i < width; i++) {
            output += " ";
        }
        output += length;
        return output;
    }
}
