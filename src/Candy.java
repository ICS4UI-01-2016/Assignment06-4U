
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE /** class extends to dessert item
 * @author munta
 */
public class Candy extends DessertItem {

    //insatnce varibales 

    private double weight;
    private int pricePerLbs;

    /**
     * Passes through the name,weight, and price of the candy
     *
     * @param name the name of the candy
     * @param weight the weight of the candy
     * @param pricePerLbs the priceperLbs of the candy.
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        //set variables 
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;

    }

    @Override
    /**
     * print outs the final output,in proper format
     */
    public String toString() {
        //convert the cost to dollars
        String lengthCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed(width-name length- cost length
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - lengthCost.length();
        //al information is set before the price is added
        String output = this.weight + " lbs " + "@ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + "/lb\n"
                + super.getName();
        //add the required amount of spaces
        for (int i = 0; i < width; i++) {
            output += " ";
        }
        //add the price to the end of the line 
        output += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //return string output
        return output;

    }

    /**
     * calculates the cost of the candy and return it.
     *
     * @return the cost the candy
     */
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);

    }

}
