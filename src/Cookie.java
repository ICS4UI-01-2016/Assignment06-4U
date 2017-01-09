
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author guanv6321
 */
public class Cookie extends DessertItem{

    // instance variables to store number of cookies and price per 12
    private int number;
    private int pricePer12;

    /**
     * constructor to initialize instance variables
     * @param name of the cookie
     * @param number of the cookie
     * @param pricePer12 of the cookie
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * gets the number of cookies
     * @return the number of cookies
     */
    public int getNumber(){
        return this.number;
    }
    
    /**
     * gets the price per dozen cookies
     * @return the price per dozen cookies
     */
    public double getPricePer12(){
        return this.pricePer12;
    }
    
    /**
     * represents information about the cookies in a string
     * @return the name, the number of cookies and the price per dozen cookies
     */
    @Override
    public String toString() {
        // converts cents to dollars
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // converts cost of candy into a string
        String costLength = "" + this.getCost();
        //calculates the amount of spaces between the cost of cookie and the item name 
        int spaces = 30 - super.getName().length() - costLength.length()-1;
        // for loop used to print out the exact amount of calculated spaces
        for (int i = 0; i < spaces; i++) {
            output = " " + output;
        }       
        return this.number + " @ $" + this.pricePer12*0.01 + " /dz \n" + super.getName() + output;                   
    }
    
    /**
     * method used to calculate cost
     * @return the total cost of the cookies
     */
    @Override
    public int getCost() {
        // formula used to calculate the total cost of the cookies
        double cost = (this.number*this.pricePer12)/12;
        // rounds total cost to an int form
        return (int)(Math.round(cost)); 
    }
}
