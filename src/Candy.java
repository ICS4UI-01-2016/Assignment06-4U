
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public int getCost() {
        return (int) (weight * pricePerLbs);
    }

    @Override
    public String toString() {
        int width = DessertShoppe.RECEIPT_WIDTH;
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int rSpaces = width - super.getName().length();
        
        String output = this.weight + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb. \n" + super.getName();
        
        output += String.format("%" + rSpaces + "s%n", cost);
        return output;
    }
}
