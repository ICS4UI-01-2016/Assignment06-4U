
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {
    //create variables
    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        //access name
        super(name);
        //initializa number of cookies
        this.number = number;
        //initialize price per 12 cookies
        this.pricePer12 = pricePer12;
    }

    /**
     * gets writing for receipt
     * @return 
     */
    @Override
    public String toString() {
        String spaces = new String();
        int run = 30 - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length());
        for (int i = 0; i < run; i++) {
            spaces = spaces + " ";
        }
        return (number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + "/dz\n" + super.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }

    /**
     * Gets total cost
     * @return cost 
     */
    @Override
    public int getCost() {
        return Math.round(pricePer12 * number / 12);
    }
}
