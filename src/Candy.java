/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Khaled
 */
public class Candy extends DessertItem {
    
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;
     
    }

 
    
    @Override
    public String toString()
    {
       return "";
    }
    
    
    public int getPricePerLbs(){
        return this.pricePerLbs;
    }
    
    public double getWeight(){
        return this.weight;
    }

    @Override
    public int getCost() {
        int cost = this.pricePerLbs * this.weight;
        long rounding = Math.round(cost);
        return 0;
    }
}
