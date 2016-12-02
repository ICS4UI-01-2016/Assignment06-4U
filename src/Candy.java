/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author richj0985
 */
public class Candy extends DessertItem {
    
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    
    @Override
    public int getCost(){
        return (int)Math.round(this.pricePerLbs * this.weight);
    }
    
    @Override
    public String toString()
    {
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb."
                + "\n" + super.getName();
        for(int i = 0; i < screenWidth; i++){
            output = output + " ";
        }
        output = output + costToDollars;
        return output;
    }
}
