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
 * @author richj0985
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }
    
    @Override
    public int getCost(){
        return super.getCost() + this.toppingCost;
    }
    
    @Override
    public String toString()
    {
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        String output = this.toppingName + " Sundae with" + "\n"
                + super.getName();
        for(int i = 0; i < screenWidth; i++){
            output = output + " ";
        }
        output = output + costToDollars;
        return output;
    }
    
}
