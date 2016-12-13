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
 * @author RajanPawar1999
 */
public class Sundae extends IceCream{
    private String toppingName;
    private int toppingCost;
    
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       super(icName, icCost);
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
    }

    
    @Override
    public String toString(){
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int space = 30 - super.getName().length() - output.length();
        for(int i = 0; i < space; i++){
            output = " " + output;
            
        }
        return this.toppingName + " Sundae With \n" + super.getName() + output;
    }
    
    @Override
    public int getCost(){
        int Cost = super.getCost() + this.toppingCost;
        return Cost;
    }
}
