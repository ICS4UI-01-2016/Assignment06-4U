
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
//extend DessertItem
public class Candy extends DessertItem {
    //create variables
    double weight;
    int pricePerLbs;

    //candy constructor
    public Candy(String name, double weight, int pricePerLbs) {
        //access the name
        super(name);
        //initialize weight
        this.weight = weight;
        //initialize price per pound
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Gets the output for receipt
     * @return output
     */
    @Override
    public String toString() {
        String spaces = new String();
        int run = 30 - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length());
        for (int i = 0; i < run; i++) {
            spaces = spaces + " ";
        }
        return (this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb."
        + "\n" + super.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));

    }

    /**
     * Gets the total cost of candy
     * @return cost
     */
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
