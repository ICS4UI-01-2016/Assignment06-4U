
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {
    //instance variables
    private double weight;
    private int pricePerLbs;

    /**
     * constructor method for Candy
     * @param name name of candy
     * @param weight weight of candy
     * @param pricePerLbs price per pound of candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        //pass in name, weight, and price per pound
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    /**
     * accessor method for the cost of the candy
     * @return cost of candy
     */
    @Override
    public int getCost() {
        //return the weight multipled by the price per pound as an int
        return (int) (weight * pricePerLbs);
    }
    
    /**
     * toString method to print out a candies parameters
     *
     * @return the created candies parameters as a string
     */
    @Override
    public String toString() {
        //width of recipt in spaces
        int width = DessertShoppe.RECEIPT_WIDTH;
        //the cost as a string 
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the remaining spaces after subtracting the length of the name of the candy
        int rSpaces = width - super.getName().length();
        //creating an output string with the same format as the example recipt
        String output = this.weight + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb. \n" + super.getName();
        //format the space between the calculated price with the spaces and add it to the output string
        output += String.format("%" + rSpaces + "s%n", cost);
        //return output
        return output;
    }
}
