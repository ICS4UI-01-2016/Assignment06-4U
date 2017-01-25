
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and
 * the price per dozen cookies.
 * The number and price per dozen are used to calculate the cost of the cookies.
 *
 * @author Brayden
 */
public class Cookie extends DessertItem {

    //create the instance variables
    private final int number;
    private final int pricePer12;

    /**
     * construct the cookie
     * @param name the name of the cookie
     * @param number the number of cookies
     * @param pricePer12 the cost per 12 cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        
        //assign the variables
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;

    }

    /**
     * return as a string
     * @return the string
     */
    @Override
    public String toString() {
        //create an integer for the width of the receipt
        int width = DessertShoppe.RECEIPT_WIDTH;
        //create an int for the amount of blank space infront of the price
        int widthCook = width - (super.getName()).length();

        //get all of the information needed to output for the given cookie
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz \n" + super.getName();
        String cookCost = DessertShoppe.cents2dollarsAndCents(this.getCost()); // get the cost of the cookie in the proper format
        output += String.format("%" + widthCook + "s", cookCost); // turn all of the information into a printable string

        //return the string
        return output;
    }

    /**
     * return the cost of the cookies
     * @return the cost of the cookies
     */
    @Override
    public int getCost() {
        int price = (int) Math.round(this.number / 12.0 * this.pricePer12);
        return  price;

    }

}
