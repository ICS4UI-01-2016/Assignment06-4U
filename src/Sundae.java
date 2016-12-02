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
        //store name of icing and cost in super
       super(icName, icCost);
       //initialize rest of variables
       toppingName = this.toppingName;
       toppingCost = this.toppingCost;
       
    }
    

    
@Override
    public String toString()
    {
        //convert cents to dollars using cens2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(super.getCost() + this.toppingCost);
     
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
        return  this.getName() + output ;
    }
public int getCost(){
    int cost = super.getCost() + this.toppingCost;
    return cost;
}
    
}
