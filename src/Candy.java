/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Khaled
 */
public class Candy extends DessertItem {
    
    //instance variable used to store the weight in double form (decimal form)
    private double weight;
    //instance variable used to store the cost of candy per pound
    private int pricePerLbs;

    /***
     * The constructor for candy used to initialize instance variables such as the name, weight of candy and price per pound
     * @param name of the candy 
     * @param weight of the candy 
     * @param pricePerLbs the price of candy per pound  
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
         //takes the super's class' name (candy)
        super(name);
        //initializes the price per pound for candy 
        this.pricePerLbs = pricePerLbs;
        //initializes the total weight of the candy 
        this.weight = weight;
     
    }

 
    /**
     * Returns a string representation of the object which in this case it's the candy
     *
     * @return the name of the candy, the price per pound, the weight of the candy and the total cost 
     */
    @Override
    public String toString()
    {

        //converts the cost of the candy and converts it to string
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculates the amount of spaces between the cost of candy and the item name 
         int numberOfSpaces = 30 - super.getName().length() - output.length();
        // for loop used to print out the exact amount of calculated spaces
        for (int i = 0; i < numberOfSpaces; i++) {
            output = " " + output;
        }
        //returns the weight of the candy, the price per pound, the name of candy and the total cost
        return this.weight + " lbs. @ $" + this.pricePerLbs*0.01 + " /lb \n" + super.getName() + output;
        
        
    }
    
    
    /**
     * a getter, used to get the price of candy per pound
     * @return the price of candy per pound
     */
    public int getPricePerLbs(){
        return this.pricePerLbs;
    }
    
    /**
     * a getter, used to get the weight of the candy 
     * @return the total weight of the candy
     */
    public double getWeight(){
        return this.weight;
    }
    
   

    /**
     * a method to calculate the total cost of the candy 
     * @return the total cost of the candy
     */
    @Override
    public int getCost() {
        //a formula used to calculate the total cost by multiplying weight with price per pound
       double cost = this.weight *this.pricePerLbs;
       // rounds the total cost of the candy 
       double rounded = Math.round(cost);
       //returns the total cost of the candy in a rounded int form
        return (int) rounded;
    }
}
