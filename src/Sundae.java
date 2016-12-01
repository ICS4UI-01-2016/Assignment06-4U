
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author sevcm7279
 */
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;
    
    /**
     * constructor to create the Sunday
     * @param icName
     * @param icCost
     * @param toppingName
     * @param toppingCost 
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        // get the name of the ice cream and the cost from the ice cream class
        super(icName, icCost);
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
                
    }

    public String toString() {
        return "";
    }
    
    /**
     * returns the cost of the Sunday
     * @return the cost of the Sunday
     */
    @Override
    public int getCost(){
        // return the cost of the toppings plus the cist of the ice cream
        return toppingCost+(super.getCost());
                
    }
}
