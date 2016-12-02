/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author richj0985
 */
public class IceCream extends DessertItem{
    
    private int cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost(){
        return cost;
    }
    
    
    @Override
    public String toString()
    {
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int screenWidth = DessertShoppe.RECEIPT_WIDTH - costToDollars.length() - super.getName().length();
        String output = super.getName();
        for(int i = 0; i < screenWidth; i++){
            output = output + " ";
        }
        output = output + costToDollars;
        return output;
    }
    
}
