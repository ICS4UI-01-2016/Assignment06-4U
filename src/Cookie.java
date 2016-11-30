/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {
    
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        number = this.number;
        pricePer12 = this.pricePer12;
        
    }

    @Override
    public int getCost(){
        return (int)Math.round(this.number / 12 * this.pricePer12);
    }
    
    @Override
    public String toString()
    {
        String output = this.number + " @ $" + pricePer12 + " /dz"
                + "/n" + super.getName() + "/t" + this.getCost();
        return output;
    }
    
}
