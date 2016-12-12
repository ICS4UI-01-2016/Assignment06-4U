/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{
    private int icCost;

    public IceCream(String name, int cost){
        super(name);
        this.icCost = icCost;
    }

    public String toString(){
     String output = this.getName() + ", "
             + icCost;
        return output;
    }
    
    @Override
    public int getCost(){
        return icCost;
    }
    
}
