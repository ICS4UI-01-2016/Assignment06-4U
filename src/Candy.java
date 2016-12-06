/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author fostp4040
 */
public class Candy extends DessertItem {
    
    private double weight;
    private int pricePerLbs;
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.pricePerLbs=pricePerLbs;
        this.weight=weight;
    }
    public double weight(){
        return this.weight;
    }
    public int pricePerLbs(){
        return this.pricePerLbs;
    }
    @Override
    public String toString()
    {
        int width = DessertShoppe.RECEIPT_WIDTH;
        width=width-super.getName().length()-4;
        String space = null;
        for(int i =0; i<width; i++){
            space=" ";
        } 
        String output = this.weight+ " @ $"+ this.pricePerLbs*0.01+"/lb."+"\n"+ super.getName()+space+DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }

    @Override
    public int getCost() {
        return (int) Math.round(weight*pricePerLbs);
    }
}
