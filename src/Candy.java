
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {
  
    private String name;
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString() {
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb.  \n";
        output = output + this.getName();
        //spaces available
        int width = DessertShoppe.RECEIPT_WIDTH;
        int outputLength = this.getName().length();
        //finding length of output
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        outputLength = outputLength + costLength;
        //find the remaining space between total space and used up space from strings
        int space = width - outputLength;
        for (int i = 0; i < space; i++) {
            output = output + " ";
        }       
        output = output + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
    
     @Override
    public int getCost() {
        int weightR = (int) Math.round(weight * pricePerLbs);
        return weightR;
    }
    
}
