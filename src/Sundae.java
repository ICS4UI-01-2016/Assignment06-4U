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
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        //a call to the IceCream constructor
       super(icName, icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;

    }
    

    //prints info about item onto the receipt (Name, Cost, etc.)
    public String toString()
    {
        String output = this.getToppingName() + " Sundae with " + "\n"
                + this.getName() + this.findLength() + (this.getCost() * 0.01);
        return output;
    }

    
    
    @Override
    /**
     * returns the total cost of the sundae (in cents)
     */
    public int getCost(){
        int s = super.getCost();
        int totalCost = s + toppingCost;
        return totalCost;
    }
    /**
     * returns the name of the topping on the sundae
     * @return the name of the topping on the sundae
     */
    public String getToppingName(){
        return toppingName;
    }
    //method to find the total length of all characters and add appropriate
    //spacing between the name and the price (making the prices parallel)
        public String findLength(){
        int n = this.getName().length();
        int t = String.valueOf(this.getCost() * 0.01).length();
        int w = n + t;
        String space = "";
        
        while(w < DessertShoppe.RECEIPT_WIDTH && w != 0){
            space = space + " ";
            w = w + 1;
        }
        return space;
        
    }
    
}
