
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author YOURNAMEHERE
 */
/**
 * class extends to desert item
 *
 * @author munta
 */
public class Cookie extends DessertItem {

    private int number;
    private int pricePer12;

    /**
     * passes through the name,number of dozens, and price per dozen
     *
     * @param name the name of the cookie
     * @param number the number of dozens of cookies
     * @param pricePer12 the price per dozen cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * print outs the final output,in proper format.
     *
     * @return
     */
    public String toString() {
        //store length of cost 
        String lengthCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - lengthCost.length() - 1;

        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + "/dz\n"
                + super.getName();
        //add the required amount of spaces 
        for (int i = 0; i <= width; i++) {
            output += " ";
        }
        //add the cost
        output += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //return output
        return output;

    }

    /**
     * calculates the cost of the cookies.
     *
     * @return the cost of the cookies.
     */
    public int getCost() {
        return (int) Math.round( pricePer12*number/12);
    }
}
