
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author sevcm7279
 */
public class Candy extends DessertItem{

    private double weight;
    private int pricePerLbs;
    private int cost;
    
    /**
     * constructor to create the candy
     * @param name
     * @param weight
     * @param pricePerLbs 
     */
    public Candy(String name, double weight, int pricePerLbs) {
        // gets the name from the DessertItem class
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
        // covert the price per lb to dollars
        double pricePerLbs = (this.pricePerLbs/100.00);
        // output the weight and cost per pound
        String output = this.weight + " lbs."
                + " @ $" + pricePerLbs + " /lb.";
        // go to the next line of the receipt
        output += "\n";
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
     * returns the cost of the cookies
     * @return the cost of the cookies
     */
    @Override
    public int getCost(){
        // multiply the weight by the price per pound
        // store the cost in a double
        double cost = pricePerLbs*weight;
        // change the cost into an int and return
        return (int) cost;
    }
}
