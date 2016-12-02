
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    private int cost;
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.cost = pricePerLbs;
    }

    public int getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        int width = DessertShoppe.RECEIPT_WIDTH;
        String output = this.weight + " lbs. @" + this.pricePerLbs + " /lbs";
        output += this.getName();
        int outputLength = output.length();
        int space = width - outputLength;

        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        
        output += this.getCost() + "";
        return output;
    }
}
