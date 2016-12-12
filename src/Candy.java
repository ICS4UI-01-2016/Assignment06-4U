
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    //inctance variables
    private double weight;
    private int pricePerLbs;

    /**
     * candy constructor
     *
     * @param name name of candy
     * @param weight weight of the candy
     * @param pricePerLbs the price per weight
     */
    public Candy(String name, double weight, int pricePerLbs) {

        //get the name from the super class
        super(name);
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;
    }

    /**
     * string to output this part of the recept
     *
     * @return the output
     */
    public String toString() {
        //make all prices line up
        int width = DessertShoppe.RECEIPT_WIDTH;
        int width2 = width - (super.getName().length());
        //outprint name
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb. \n" + this.getName();
        String candyCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        output += String.format("%" + width2 + "s", candyCost);


        return output;
    }

    @Override
    /**
     * get the price of the candy
     */
    public int getCost() {
        int price = (int) Math.round(this.weight * this.pricePerLbs);
        return price;
    }
}
