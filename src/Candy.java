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
       this.pricePerLbs = pricePerLbs;
       this.weight = weight;
    }
 
    @Override
    public String toString()
    {
        //finds and set the number of spaces for each line
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int space = 30 - super.getName().length() - output.length();
        for(int i = 0; i < space; i++){
            output = " " + output;
        }
       return this.weight + " lbs. @ $" + this.pricePerLbs*0.01 + " /lb. \n" + super.getName() + output;
    }

    @Override
    public int getCost() {
        double Cost = (this.weight * (this.pricePerLbs));
        return (int)Cost;
    }
}
