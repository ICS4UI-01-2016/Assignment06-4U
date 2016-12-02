
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author sevcm7279
 */
public class Cookie extends DessertItem{
    
    private int cost;
    private int pricePer12;
    private int number;
    
    /**
     * constructor to create the cookies
     * @param name
     * @param number
     * @param pricePer12 
     */
    public Cookie(String name, int number, int pricePer12) {
        // gets the name of the candy from the DessertItem class
        super(name);
        this.cost = cost;
        this.pricePer12 = pricePer12;
        this.number = number;
    }

    public String toString() {
        // covert price per 12 to dollars
        double pricePer12 = (this.pricePer12/100.00);
        // output number and cost per 12
        String output = number + " @ $" + pricePer12 + " /dz" + "\n";
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
     * finds the cost for a single cookie
     * determines the total cost for cookies
     * @return the total cost of the cookies
     */
    @Override
    public int getCost(){
        // divides the price per dozen by 12 to find the price for one
        int priceSingle = pricePer12/12;
        // multiply the cost for one by the number of cookies
        this.cost = priceSingle*number;
        // return the price of the cookies
        return cost;
    }
    
    public int getPrice12(){
        return this.pricePer12;
    }
}
