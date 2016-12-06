/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author fostp4040
 */ 
public class IceCream extends DessertItem {

    private int cost;
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost=cost;
    }
    public int cost(){
        return this.cost;
    }

    @Override
    public String toString()
    {
        int width = DessertShoppe.RECEIPT_WIDTH;
        width=width-super.getName().length()-4;
        String space = " ";
        for(int i =0; i<width; i++){
            space=" ";
        }
        String output = super.getName()+space+DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
