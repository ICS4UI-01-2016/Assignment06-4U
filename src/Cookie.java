/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author fostp4040
 */ 
public class Cookie extends DessertItem{
    
    private int number;
    private double pricePer12;
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.pricePer12=pricePer12;
        this.number=number;
    }

    public int number(){
        return this.number;
    }
    public double pricePer12(){
        return this.pricePer12;
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
        String output = this.number+ " @ $"+ this.pricePer12*0.01+"/dz."+"\n"+ super.getName()+space+DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
    @Override
    public int getCost() {
        return (int) Math.round(number*pricePer12/12);
    }
    
}
