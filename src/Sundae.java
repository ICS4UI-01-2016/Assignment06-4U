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
 * @author Khaled
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;

   
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        //takes the super's class' name and cost 
       super(icName,icCost);
       
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
    }
    
    public int getToppingCost(){
        return toppingCost;
        
    }
    
    public String toppingName(){
        return toppingName;
    }
    

    
    @Override
    public String toString()
    {
        
         String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
         return super.getName() + " " + output;
    }
    
    public int getCost(){
        int cost = super.getCost() + this.toppingCost;
        return cost;
    }
    
   
    
}
