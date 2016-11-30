/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {
    
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        weight = this.weight;
        pricePerLbs = this.pricePerLbs;
    }

    
    @Override
    public int getCost(){
        return (int)Math.round(this.pricePerLbs * this.weight);
    }
    
    @Override
    public String toString()
    {
        String output = this.weight + " lbs. @ $" + pricePerLbs + " /lb."
                + "/n" + super.getName() + "/t" + this.getCost();
        return output;
    }
}
