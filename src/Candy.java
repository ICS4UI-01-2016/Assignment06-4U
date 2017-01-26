
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author kulla6503
 */
public class Candy extends DessertItem {

    // Creating a instance variable to store the weight 
    private int pricePerLbs;
    // Creating a instance variable to store the price per pound of candy
    private double weight;

    /**
     * Creating a constructor which initializes the instance variables
     *
     * @param name of candy
     * @param weight of candy
     * @param pricePerLbs of candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        
        // The super class name is taken 
        super(name);
        
        // Initializing the total weight of the candy 
        this.weight = weight;
        
        // Initializing the price per pound of candy 
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
     * Gets the price of candy per pound
     *
     * @return the price of candy per pound
     */
    private int getPricePerLbs() {
        return this.pricePerLbs;
    }

    /**
     * The string contains information of the candy
     *
     * @return the name, price per pound, weight, and total cost of the candy
     */
    @Override
    public String toString() {

        // The currency of cents is converted to dollars 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());

        // The cost of candy is converted to a string 
        String costLength = "" + this.getCost();

        // Calculates the number of spaces between the cost of candy and the item name 
        int numberofspaces = 30 - super.getName().length() - costLength.length() - 1;

        // For loop created and used to print out the exact number of calculated spaces
        for (int i = 0; i < numberofspaces; i++) {
            output = " " + output;
        }

        // Returns the weight, price per pound, name, and total cost of candy 
        return this.weight + " lbs. @ $" + this.pricePerLbs * 0.01 + " /lb. \n" + super.getName() + output;

    }

    /**
     * Method used to calculate cost of the candy
     *
     * @return the total cost of the candy
     */
    @Override
    public int getCost() {
        
        // A formula used to calculate the total cost by multiplying the price per pound of candy with the weight of the candy
        double cost = this.weight * this.pricePerLbs;

        // Rounds the total cost of the candy 
        double roundedCostOfCandy = Math.round(cost);

        // Returns the total cost of the candy which is rounded 
        return (int) roundedCostOfCandy;
    }
}
