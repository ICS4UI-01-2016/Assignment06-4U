/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author fostp4040
 */
public class Sundae extends IceCream{
    
    private int icCost;
    private String toppingName;
    private int toppingCost;
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        super(icName,icCost);
        this.icCost=icCost;
        this.toppingCost=toppingCost;
        this.toppingName=toppingName;
    }
    public String icName(){
        return super.getName();
    }
    public int icCost(){
        return super.getCost();
    }
    public String toppingName(){
        return this.toppingName;
    }
    public int toppingCost(){
        return this.toppingCost;
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
        String output = this.toppingName+" Sundae with"+"\n"+super.getName() +space+ DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
    @Override
    public int getCost() {
        return icCost+toppingCost;
    }
}
