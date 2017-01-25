
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound.
 * The weight and price per pound are used to calculate the cost of the Candy.
 *
 * @author Brayden
 */
public class Candy extends DessertItem {

    //instance variables to be used
    private final double weight;
    private final int pricePerLbs;

    /**
     * constructor
     *
     * @param name the name of the candy
     * @param weight the weight of the candy
     * @param pricePerLbs the cost per pounds of the candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        
        //assign the variables
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;

    }

    /**
     * convert the information in the candy to a printable string
     *
     * @return the printable string
     */
    @Override
    public String toString() {
        int width = DessertShoppe.RECEIPT_WIDTH; //get the width of the receipt
        int widthCand = width - (super.getName()).length(); //get the width of the candy receipt

        //get all of the information needed to output for the given candy
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb. \n" + super.getName();
        String candCost = DessertShoppe.cents2dollarsAndCents(this.getCost()); //get the cost of the candy
        output += String.format("%" + widthCand + "s%n", candCost); //format the line to fi properly to the receipt
        return output; //return the formatted output
    }

    /**
     * return the cost of the candy
     *
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        int price = (int) Math.round(this.weight * this.pricePerLbs); //get the price of the cookies in the form of an int
        return price; //return the price

    }
}
