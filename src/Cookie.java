
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and
 * the price per dozen cookies.
 * The number and price per dozen are used to calculate the cost of the cookies.
 *
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {

    // instance variables
    private int number;
    private int pricePer12;

    /**
     * Constructor for Cookie
     *
     * @param name of the cookie
     * @param number of cookies
     * @param pricePer12 price per dozen cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Gets the number of cookies
     *
     * @return the number of cookies
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Gets the price per dozen cookies
     *
     * @return the price per dozen cookies
     */
    public int getPricePer12() {
        return this.pricePer12;
    }

    /**
     * Gets the cost of the cookies
     *
     * @return the cost of the cookies
     */
    @Override
    public int getCost() {
        return Math.round((this.getPricePer12() * this.getNumber()) / 12);
    }

    /**
     * Converts the name and cost of the ice cream to a string and formats it to
     * fit the receipt
     *
     * @return the number of cookies, price per dozen cookies, name of the
     * cookies, and cost of the cookies
     */
    @Override
    public String toString() {
        // string to get the length of the output without spaces
        String length = this.getName() + DessertShoppe.cents2dollarsAndCents(this.getCost());
        // number of spaces needed
        int numSpaces = DessertShoppe.RECEIPT_WIDTH - length.length();
        // variable to add spaces to
        String spaces = "";
        // loop to add the spaces
        for (int i = 0; i < numSpaces; i++) {
            spaces = spaces + " ";
        }
        // outputs everything
        String output = this.getNumber() + " @ $" + DessertShoppe.cents2dollarsAndCents(this.getPricePer12()) + " /dz\n" + this.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
}
