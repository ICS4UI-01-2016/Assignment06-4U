
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author tatad6701
 */
public class Cookie extends DessertItem {

    // Creating the instance variables to be used
    private int number;
    private int pricePer12;

    /**
     * Constructor for the cookie!
     *
     * @param name of the cookie that is being passed through
     * @param number of the cookies being bought
     * @param pricePer12 the price of the 12 cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        // Initializing the instance variables
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Method that gets the cost of the cookies
     *
     * @return the cost of the cookies
     */
    public int getCost() {
        // Getting the cost of the cookie(s)
        // (this.number / 12) * pricePerLbs == one cookie is 0.33 == 33 cents
        int price = (int) Math.round((this.number / 12.0) * this.pricePer12);
        // Return the price of the cookie(s)
        return price;
    }

    /**
     * Method that prints out the text nicely
     *
     * @return the output string which holds the text that is being formatted
     * properly
     */
    public String toString() {
        // Create a empty string 
        String output = "";
        // Changing the cost from cents to dollars
        String changedToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the space that is leftover 
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        // Printing the information on the receipt and formating the text properly for the receipt
        output += this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz" + "\n" + super.getName();
        // "%" = indicates the formatting of the receipt && "s" = indicates the amount of spaces (note to myself)
        output += String.format("%" + (widthLeft) + "s", changedToDollars);

        // Return the output
        return output;
    }
}
