
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    //private integers for weight of candy and price per pound of candy
    private double weight;
    private int pricePerLbs;

    /**
     * Candy constructor
     * @param name name of candy
     * @param weight weight of candy
     * @param pricePerLbs price per pound of candy 
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
        String output = this.getName() + ", "
                + this.weight + ", "
                + this.pricePerLbs;
        return output;
    }

    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
