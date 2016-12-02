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

        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
         int numberOfSpaces = 30 - super.getName().length() - output.length();
        
        for (int i = 0; i < numberOfSpaces; i++) {
            output = " " + output;
        }
       
        return this.weight + " lbs. @ $" + this.pricePerLbs*0.01 + " /lb \n" + super.getName() + output;
        
        
    }
    
    
    public int getPricePerLbs(){
        return this.pricePerLbs;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
   

    @Override
    public int getCost() {
        //First let's convert the weight (double) into int to avoid any complications by returning it in speicifc way
        
       
        
       double cost = this.weight *this.pricePerLbs;
       double rounded = Math.round(cost);
        return (int) rounded;
    }
}
