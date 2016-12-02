
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author sevcm7279
 */
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;
    
    
    /**
     * constructor to create the Sunday
     * @param icName
     * @param icCost
     * @param toppingName
     * @param toppingCost 
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        // get the name of the ice cream and the cost from the ice cream class
        super(icName, icCost);
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
                
    }

    public String toString() {
        // output the type of sundae
        String output = toppingName + " Sundae with" + "\n";
        // convert cost to dollars
        double cost = ((getCost())/100.00);
  
        // create output and add the name
        output += this.getName(); 
        // determine the number of spaces the name takes up
        int nLength = (super.getName()).length();
        // make the cost into a string
        String cost2 = Double.toString(cost);
        // determine the number of spaces the price takes up
        int pLength = cost2.length();
        int width = DessertShoppe.RECEIPT_WIDTH;
        
        // determine the space needed between the name and cost
        int space = width - (nLength + pLength);
        
        for (int i = 0; i < space; i++) {
            // add the spaces to the output
            output += " ";
        }
        // add the cost to the output
        output += cost2;
        return output;
    }
    
    /**
     * returns the cost of the Sunday
     * @return the cost of the Sunday
     */
    @Override
    public int getCost(){
        // return the cost of the toppings plus the cist of the ice cream
        return toppingCost+(super.getCost());
                
    }
}
