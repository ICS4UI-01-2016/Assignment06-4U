/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author laurelizall
 */
public class Candy extends DessertItem {
    
    private int cost;
    private int number;
    private int pricePerLbs;
    private double weight;
    
    public Candy(String name, double weight, int pricePerLbs){
            // call to dessertitem constructor
        super(name);
        this.cost = pricePerLbs;
    }

    @Override
    public String toString() {
       String output = this.number + " @ $" + pricePerLbs + "/lbs";
       output = this.getName() + "     " + this.getCost();                       // how to do a tab
       return output;
    }
    
    @Override
    public int getCost() {
        // EDIT round double
        return weight * pricePerLbs;
    }
}