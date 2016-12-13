/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author RajanPawar1999
 */
public class Candy extends DessertItem{
    private int weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs){
        super(name);
        this.weight = (int)weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    @Override
    public String toString(){
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int space = 30 - super.getName().length() - output.length();
        for(int i = 0; i < space; i++){
            output = " " + output;
        }
        return this.weight + " lbs. @ $" + this.pricePerLbs*0.01 + " /lb. \n" + super.getName() + output;
    }

    @Override
    public int getCost() {
        int Cost = (this.pricePerLbs)*(this.weight);
        return (int) Cost;
    }
}
