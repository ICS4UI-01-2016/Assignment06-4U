/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author RajanPawar1999
 */
public class IceCream extends DessertItem{
    private int cost;

    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }
  
    @Override
    public String toString(){
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int space = 30 - super.getName().length() - output.length();
        for(int i = 0; i < space; i++){
            output = " " + output;
        }
     return super.getName() + output;
    }

    @Override
    public int getCost() {
        return this.cost;
            }
    
}
