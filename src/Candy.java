
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound.
 * The weight and price per pound are used to calculate the cost of the Candy.
 *
 * @author Thomas'/
 */
//candy is a dessert item
public class Candy extends DessertItem {

    //variables for class
    private double weight;
    private int pricePerLbs;

    //constructor for candy
    //takes a name, weight of candy and price per pound of candy
    public Candy(String name, double weight, int pricePerLbs) {
        //send name to dessert class
        super(name);
        //assign variables
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;

    }

    @Override
    //method prints information to 'reciept' in proper format
    public String toString() {
        //convert from cents to dollars and convert the number to a string
        String costDollars = DessertShoppe.cents2dollarsAndCents(getCost());
        //convert from cents to dollars and convert the number to a string
        String costWeightDollars = DessertShoppe.cents2dollarsAndCents(this.pricePerLbs);
        //calculate number of spaces that need to be added to get proper format
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costDollars.length();
        //put different elements of a reciept entry for candy together in proper format
        String output = this.weight + " lbs." + " @ $" + costWeightDollars + " /Lb" + "\n"
                + super.getName();
        //add appropriate number of spaces between name and cost
        for (int i = 0; i < width; i++) {
            output += " ";
        }
        //add cost to end
        output += costDollars;
        //return output
        return output;
    }

    @Override
    //calculates cost of candy
    public int getCost() {
        //multiply weight by price per pound to get cost
        return (int) Math.round(this.weight * this.pricePerLbs);
    }
}
