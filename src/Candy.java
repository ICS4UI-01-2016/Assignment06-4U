
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author guanv6321
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public double getWeight() {
        return this.weight;
    }

    private int getPricePerLbs() {
        return this.pricePerLbs;
    }

    @Override
    public String toString() {
        String output = this.getWeight() + " lbs. @ " + "$" + (this.getPricePerLbs()*0.01) 
                      + " /lb." + " \n" + this.getName() + (this.getCost()*0.01);
        return output;
    }

    @Override
    public int getCost() {
        double cost = this.weight*this.pricePerLbs;
        return (int)(Math.round(cost)); 
    }
    
}
