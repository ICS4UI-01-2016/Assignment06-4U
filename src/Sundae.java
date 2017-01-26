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
    //create variables
    String toppingName;
    int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
        //access ice cream name and cost
    super(icName,icCost); 
    //initialize variables
    this.toppingName = toppingName;
    this.toppingCost = toppingCost;
    }
        
   /**
   *get print for receipts
   * @return ouput
   */
    @Override
    public String toString(){ 
   //make string for spaces
    String spaces = new String();
    //necessary amount of spaces
    int run = 30 - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length());
    //add the amount of spaces
    for(int i = 0; i < run; i++){
    spaces = spaces + " ";
    }
    return (this.toppingName + " sundae" + " with\n" + super.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    /**
     * get cost
     * @return cost
     */
    @Override
    public int getCost(){
     return super.getCost() + toppingCost;
    } 
}
