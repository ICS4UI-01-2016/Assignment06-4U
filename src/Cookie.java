
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
    //number of dozens

    private int num;
    //price per dozen cookies
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        //calls the super class for the name
        super(name);
        this.num = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Gets the overall cost and rounds it
     *
     * @return
     */
    @Override
    public int getCost() {
        return (int) Math.round(pricePer12 * num / 12);
    }

    /**
     * Prints the name and prices of cookies, spaces between name and price
     *
     * @return name and prices of cookies, spaces
     */
    @Override
    public String toString() {
        //converts the cent amount to dollars
        String length = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //gets spaces between name and price
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - length.length();
        //constructing the order that things are printed
        String output = this.num + " @ " + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz. \n" + super.getName();
        //prints the spaces
        for (int i = 0; i < width; i++) {
            output += " ";
        }
        output += length;
        return output;
    }
}
