/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs)
    {super(name);
    this.weight = weight;
    this.pricePerLbs = pricePerLbs;
    }

 
    @Override
    public String toString()
    {
       return "";
    }

    
    @Override
    public int getCost() {
        return
    }
}
