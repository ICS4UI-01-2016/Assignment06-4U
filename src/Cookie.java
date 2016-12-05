
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

    //instance variables
    private int number;
    private int pricePer12;

    /**
     * constructor method for cookie
     *
     * @param name the name of cookie
     * @param number the number of cookies
     * @param pricePer12 the price per 12 cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        //pass in name, number and price per 12
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * accessor method to get the cost of the cookies
     * @return return the cost
     */
    @Override
    public int getCost() {
        //calculate the price as an int and round
        int price = (int) Math.round((this.number / 12.0) * this.pricePer12);
        //return price
        return price;
    }

    /**
     * toString method to print out a cookies parameters
     *
     * @return the created cookies parameters as a string
     */
    @Override
    public String toString() {
        //width of recipt in spaces
        int width = DessertShoppe.RECEIPT_WIDTH;
        //the cost as a string 
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //the remaining spaces after subtracting the length of the name of the cookie
        int rSpaces = width - super.getName().length();
        //creating an output string with the same format as the example recipt
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz \n" + super.getName();
        //format the space between the calculated price with the spaces and add it to the output string
        output += String.format("%" + rSpaces + "s%n", cost);
        //return output
        return output;
    }

}
