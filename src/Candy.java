
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {
    //create private variables

    private double weight;
    private int pricePerLbs;
    private double cost;

    //contructor for candy
    public Candy(String name, double weight, int pricePerLbs) {
        //store candy name in the super class
        super(name);
        //initialize variables
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
        //calculate cost of candy
        cost = Math.round(this.weight * this.pricePerLbs);
    }

    /**
     * Returns details of candy with proper spacing
     *
     * @return weight of candy purchased, cost per pound, name of candy and
     * final cost
     */
    @Override
    public String toString() {

        //convert cents to dollars using cents2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //create string storing cost in a string 
        String costLength = Integer.toString(this.getCost());
        //find spacing needed between name and cost in reciept by subtracting 30(total spaces) by 
        //length of name and length of cost
        int spacing = 30 - super.getName().length() - costLength.length() - 1;
        //loop through an add a space each time up to "spacing" integer
        for (int i = 0; i < spacing; i++) {
            output = " " + output;
        }
        //return name of cookie along with cost along with the right format posting amount of pounds with cost per pound
        return this.weight + " lbs. " + "@ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb.\n" + this.getName() + output;
    }

    /**
     * Returns the cost of the candy
     *
     * @return the cost of the candy
     */
    @Override
    public int getCost() {


        //return cost converted to int
        return (int) cost;
    }
}
