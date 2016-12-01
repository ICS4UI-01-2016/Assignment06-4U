
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author sevcm7279
 */
public class Candy extends DessertItem{

    private double weight;
    private int pricePerLbs;
    
    /**
     * constructor to create the candy
     * @param name
     * @param weight
     * @param pricePerLbs 
     */
    public Candy(String name, double weight, int pricePerLbs) {
        // gets the name from the DessertItem class
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
        return "";
    }
    
    /**
     * returns the cost of the cookies
     * @return the cost of the cookies
     */
    @Override
    public int getCost(){
        // multiply the weight by the price per pound
        // store the cost in a double
        double cost = pricePerLbs*weight;
        // change the cost into an int and return
        return (int) cost;
    }
}
