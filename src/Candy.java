/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs)
    {
        // a call to the DessertItem constructor
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

 
    
    public String toString()
    {
        //prints info about item onto the receipt (Name, Cost, etc.)
        String output = this.getWeight() + " lbs. @ "
                + "$" + (this.getPricePerLbs() * 0.01) + " /lb." + "\n"
                + this.getName() + this.findLength() + (this.getCost() * 0.01);
                   
                
       return output;
    }

    @Override
    
    /**
     * returns the cost (in cents) of the Candy
     */
    public int getCost() {
        double cost = pricePerLbs * weight;
        return (int)Math.round(cost);
    }
    /**
     * returns the weight of the candy being purchased
     * @return the weight of the candy being purchased
     */
    public double getWeight(){
        return weight;
    }
    /**
     * returns the price per lb of candy
     * @return the price per lb of candy
     */
    public int getPricePerLbs(){
        return pricePerLbs;
    }
        //method to find the total length of all characters and add appropriate
    //spacing between the name and the price (making the prices parallel)
    public String findLength(){
        int n = this.getName().length();
        int t = String.valueOf(this.getCost() * 0.01).length();
        int numSpace = n - t; 
        int w = n + t;
        String space = "";
        
        while(w < DessertShoppe.RECEIPT_WIDTH && w != 0){
            space = space + " ";
            w = w + 1;
        }
        return space;
        
    }
}
