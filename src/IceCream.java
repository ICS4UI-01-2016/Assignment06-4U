/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {
    private int cost;

    public IceCream(String name, int cost)
    {
        super(name);
        this.cost=cost;
    }

  
    public String toString()
    {
        String output=Sundae.class.toString()+super.getName();
     return "";
    }
    
    public int getCost(){
        return cost;
    }
    
    
}
