
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author laurelizall
 */
public class Candy extends DessertItem {

    private int cost;
    private int number;
    private int pricePerLbs;
    private double weight;

    public Candy(String name, double weight, int pricePerLbs) {
        // call to dessertitem constructor
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString() {
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb." + "\n";
        output = output + this.getName();
        // how many spaces?
        int width = DessertShoppe.RECEIPT_WIDTH;
        int outputLength = this.getName().length();
        // add costLength to the outputLength
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        outputLength = outputLength + costLength;
        int remainingSpace = width - outputLength;
        // insert enough spaces to make the layout equal
        for (int i = 0; i < remainingSpace; i++) {
            output = output + " ";
        }
        // save string length
        output = output + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }

    @Override
    public int getCost() {
        // EDIT round double
        int weightRound = (int) Math.round(weight * pricePerLbs);
        return weightRound;
    }
}