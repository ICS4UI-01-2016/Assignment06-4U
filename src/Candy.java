
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author guanv6321
 */
public class Candy extends DessertItem {

    // instance variables to store weight and price/lb of candy
    private double weight;
    private int pricePerLbs;

    /**
     * constructor to initialize instance variables
     * @param name of the candy
     * @param weight of the candy
     * @param pricePerLbs of the candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * gets the weight of the candy
     * @return the weight of the candy
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * gets the price of candy per pound
     * @return the price of candy per pound
     */
    private int getPricePerLbs() {
        return this.pricePerLbs;
    }

    /**
     * represents information about the candy in a string
     * @return the name, price per pound, weight, and total cost of the candy
     */
    @Override
    public String toString() {
        // converts cents to dollars
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // converts cost of candy into a string
        String costLength = "" + this.getCost();
        //calculates the amount of spaces between the cost of candy and the item name 
        int spaces = 30 - super.getName().length() - costLength.length()-1;
        // for loop used to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            output = " " + output;
        }
        return this.weight + " lbs. @ $" + this.pricePerLbs*0.01 + " /lb. \n" + super.getName() + output;
        
    }

    /**
     * method used to calculate cost
     * @return the total cost of the candy
     */
    @Override
    public int getCost() {
        // formula used to calculate the total cost of the candy
        double cost = this.weight*this.pricePerLbs;
        // rounds total cost to an int form
        return (int)(Math.round(cost)); 
    }
    
}
