
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author kulla6503
 */
public class Cookie extends DessertItem {

    // Creating a instance variable to store the number of cookies and price per 12
    private int number;
    private int pricePer12;

    /**
     * Creating a constructor to initialize the instance variables
     *
     * @param name of the cookie
     * @param number of the cookie
     * @param pricePer12 for the price of each dozen of cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        
        // The super class name is taken
        super(name);
        
        // Initializing the number of cookies 
        this.number = number;
        
        // Initializing the price per dozen cookies 
        this.pricePer12 = pricePer12;
    }

    /**
     * Gets the number of cookies ordered
     *
     * @return the amount of cookies ordered
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Gets the price of cookies per dozen
     *
     * @return the price per dozen cookies
     */
    public double getPricePer12() {
        return this.pricePer12;
    }

    /**
     * The string contains information of the cookie
     *
     * @return the name, the number of cookies and the price per dozen cookies
     */
    @Override
    public String toString() {

        // The currency of cents is converted to dollars 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());

        // The cost of cookie is converted to a string 
        String costLength = "" + this.getCost();

        // Calculates the number of spaces between the cost of cookie and the cookie name
        int numberofspaces = 30 - super.getName().length() - costLength.length() - 1;

        // For loop created and used to print out the exact number of calculated spaces
        for (int i = 0; i < numberofspaces; i++) {
            output = " " + output;
        }

        // Returns the weight, price per pound, name, and total cost of candy 
        return this.number + " @ $" + this.pricePer12 * 0.01 + " /dz \n" + super.getName() + output;
    }

    /**
     * Method used to calculate cost of the cookie
     *
     * @return the total cost of the cookie
     */
    @Override
    public int getCost() {
        
        // A formula used to calculate the total price per dozen cookies. 
        double cost = (this.number * this.pricePer12) / 12;
        
        // Rounds the total cost 
        return (int) (Math.round(cost));
    }
}
