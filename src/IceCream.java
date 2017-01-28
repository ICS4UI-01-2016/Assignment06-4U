/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {
    //create variables
    private int cost;
    
    public IceCream(String name, int cost){
    //access 
    super(name);
    //initialize cost
    this.cost = cost;
    }

  /**
   *get print for receipts
   * @return ouput
   */
    @Override
    public String toString(){
    String spaces = new String();
    int run = 30 - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length());
    for(int i = 0; i < run; i++){
    spaces = spaces + " ";
    }
     return (super.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }

    /**
     * Get cost
     * @return cost
     */
    @Override
    public int getCost() {
        return cost;
        
    }
    
}
