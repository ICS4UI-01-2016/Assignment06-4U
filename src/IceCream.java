/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{
    private int cost;
    public IceCream(String name, int cost)
    {
        // a call to the DessertItem constructor
        super(name);
        this.cost = cost;
    }

  //prints info about item onto the receipt (Name, Cost, etc.)
    public String toString()
    {
        String output = this.getName() + this.findLength() + (this.getCost() * 0.01);
     return output;
    }

    @Override
    /**
     * returns the cost of the ice cream (in cents)
     */
    public int getCost() {
        return cost;
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
