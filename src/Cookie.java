/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Khaled
 */
public class Cookie extends DessertItem {
    
    private int number;
    private int pricePer12;
    
    /**
     * Constructor designed to initialize instance variables such as name,number and price per 12
     * @param name of the cookie 
     * @param number the amount of cookies
     * @param pricePer12 the price for each dozen of cookies
     */
    public Cookie(String name, int number, int pricePer12)
    {
        //takes the super's class' (upper class) name (cookie) 
        super(name);
        
        //initializes the number of cookies ordered 
        this.number = number;
        //initializes the price of cookies per dozen
        this.pricePer12 = pricePer12;
    }

    
    /**
     * a getter used to get the number of cookies ordered
     * @return the amount of cookies ordered 
     */
    public int getNumber(){
        return number;
    }
    
  
    

    /**
     * Returns a string representation of the object which in this case it's the cookies
     *
     * @return the name of the cookie, the price of a dozen, the amount of cookies and the total cost 
     */
    @Override
    public String toString()
    {
         //converts the cost of the cookies and converts it to string
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
         //calculates the amount of spaces between the cost of cookie and the item name 
        int numberOfSpaces = 30 - super.getName().length() - output.length();
          // for loop used to print out the exact amount of calculated spaces 
        for (int i = 0; i < numberOfSpaces; i++) {
            output = " " + output;
        }
        //returns the name of the cookie, the price of a dozen, the amount of cookies and the total cost
        return this.number + " @ $" + this.pricePer12*0.01 + " /dz \n" + super.getName() + output;
        
        
    }

     /**
     * a method to calculate the total cost of the cookies
     *
     * @return the total cost of the cookies
     */
    @Override
    public int getCost() {
       //the integer which returns the cost of ONE Cookie, therefore divide number by 12 (e.g 24/12 = 2 dozens)
        int cost = ((this.number) * this.pricePer12)/12;
      
        return cost;
    }
    
}
