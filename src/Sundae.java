
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream {
    
    
    //inctence variables 
    private String toppingName;
    private int toppingCost;
    
    /**
     * constructor for sundae
     * @param icName the ice cream name from the ice cream class
     * @param icCost the ice cream cost from the ice cream class
     * @param toppingName the name of the topping
     * @param toppingCost the cost of the toppings
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        //get the name and cost from the super class
        super(icName, icCost);
        //make the cost of the toppings for this class
        this.toppingCost = toppingCost;
        //make the name of the toppings for this class
        this.toppingName = toppingName;

    }
    
    
    /**
     * output this part of the recept
     * @return the output
     */
    public String toString() {
        
        
        //make all prices line up
        int width = DessertShoppe.RECEIPT_WIDTH;
        int width2 = width - (super.getName().length());
        
        //outprint the name 
        String output = this.toppingName + " Sundae with \n" + super.getName();
        String sunCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        output += String.format("%" + width2 + "s", sunCost);
        
        return output;
    }

    @Override
    /**
     * get the cost of the sundae
     */
    public int getCost() {
        return (super.getCost() + this.toppingCost);
    }
}
