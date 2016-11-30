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
        super(name);
        cost = this.cost;
    }

    @Override
    public int getCost(){
        return cost;
    }
    
    
    @Override
    public String toString()
    {
        String output = super.getName() + "/t" + this.getCost();
        return output;
    }
    
}
