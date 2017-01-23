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
 * @author Kevin 
 */
public class Sundae extends IceCream{
    //create string to store topping name
String toppingName;

    /**
     * Sundae constructor
     * @param icName name of ice cream
     * @param icCost cost of ice cream
     * @param toppingName name of topping
     * @param toppingCost cost of topping 
     */
    public Sundae(String icName, int icCost, String toppingName, int  toppingCost)
    {
        //store name of ice cream and cost in super
       super(icName, icCost + toppingCost);
       //initialize rest of variables
       this.toppingName = toppingName;
  
       
    }
    

    /**
     * Returns the details of the sundae with proper spacing
     * @return the print out of the cost and item in the proper format
     */
@Override
    public String toString()
    {
        //convert cents to dollars using cens2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(super.getCost());
     
        //create string storing cost in a string 
        String costLength = Integer.toString(super.getCost() + this.getCost());
        //find spacing needed between name and cost in reciept by subtracting 30(total spaces) by 
        
        //length of name and length of cost
        int spacing = 30- super.getName().length() - costLength.length() - 1;
        
        //loop through an add a space each time up to "spacing" integer
     for(int i = 0; i < spacing ; i ++){
         output = " " +output ;
     }
     //return name of cookie along with cost
        return this.toppingName + " Sundae with\n" + this.getName() + output ;
    }

    
}
