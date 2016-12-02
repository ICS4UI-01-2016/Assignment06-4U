/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author richj0985
 */
public class Cookie extends DessertItem {
    
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
        
    }

    @Override
    public int getCost(){
        return (int)Math.round((this.number / 12.0) * this.pricePer12);
    }
    
    @Override
    public String toString()
    {
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz"
                + "\n" + super.getName();
        for(int i = 0; i < screenWidth; i++){
            output = output + " ";
        }
        output = output + costToDollars;
        return output;
    }
    
}
