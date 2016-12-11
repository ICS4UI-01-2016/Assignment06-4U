/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem{
    
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
       super(name);
       this.number = number;
       this.pricePer12 = pricePer12;
    }

    public int number(){
        return this.number;
    }
        
    public int pricePer12(){
        return this.pricePer12;
    }
    
    
    
    @Override
    public String toString()
    {
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int space = 30 - super.getName().length() - output.length();
        for(int i = 0; i < space; i++){
            output = " " + output;
        }
       return this.number + "@ $" + this.pricePer12*0.01 + " /dz \n" + super.getName() + output;
    }

    @Override
    public int getCost() {
        int Cost = ((this.number * this.pricePer12)/12);
        return Cost;
    }
    
}
