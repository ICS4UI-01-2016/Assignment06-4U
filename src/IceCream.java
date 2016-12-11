/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{
    
    private int Cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.Cost = cost;
    }

  
    @Override
    public String toString()
    {
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int space = 30 - super.getName().length() - output.length();
        for(int i = 0; i < space; i++){
            output = " " + output;
        }
        return super.getName() + output;
    }

    @Override
    public int getCost() {
        return this.Cost;
    }
    
}
