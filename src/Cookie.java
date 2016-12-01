
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author sevcm7279
 */
public class Cookie extends DessertItem{
    
    private int cost;
    private int pricePer12;
    private int number;
    
    /**
     * constructor to create the cookies
     * @param name
     * @param number
     * @param pricePer12 
     */
    public Cookie(String name, int number, int pricePer12) {
        // gets the name of the candy from the DessertItem class
        super(name);
        this.cost = cost;
        this.pricePer12 = pricePer12;
        this.number = number;
    }

    public String toString() {
        String output = "Dog-> Name: " + this.getName() 
               + "  Age: " + this.getName();
               
       return output;
    }
    
    /**
     * finds the cost for a single cookie
     * determines the total cost for cookies
     * @return the total cost of the cookies
     */
    @Override
    public int getCost(){
        // divides the price per dozen by 12 to find the price for one
        int priceSingle = pricePer12/12;
        // multiply the cost for one by the number of cookies
        this.cost = priceSingle*number;
        // return the price of the cookies
        return cost;
    }
    
    public int getPrice12(){
        return this.pricePer12;
    }
}
