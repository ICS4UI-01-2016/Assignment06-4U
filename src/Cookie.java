/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem{
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        // a call to the DessertItem constructor
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
        
    }

    
    public String toString()
    {
        //prints info about item onto the receipt (Name, Cost, etc.)
        String output = this.getNumber() + " @ $" + (this.pricePer12 * 0.01) + "\n"
                + this.getName() + this.findLength() + (this.getCost() * 0.01);
                
        return output;
    }

    @Override
    /**
     * returns the cost (in cents) of the amount of cookies being purchased
     */
    public int getCost() {
        double costTemp = pricePer12/12f;
        int cost = (int)Math.round(costTemp * number);
        return cost;
    }
    
    
    /**
     * returns the number of cookies being purchased
     * @return 
     */
    public int getNumber(){
        return number;
    }
        //method to find the total length of all characters and add appropriate
    //spacing between the name and the price (making the prices parallel)
        public String findLength(){
        int n = this.getName().length();
        int t = String.valueOf(this.getCost() * 0.01).length(); 
        int w = n + t;
        String space = "";
        
        while(w < DessertShoppe.RECEIPT_WIDTH && w != 0){
            space = space + " ";
            w = w + 1;
        }
        return space;
        
    }
    
}
