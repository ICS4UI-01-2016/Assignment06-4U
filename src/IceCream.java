/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{
    
    //public and private variables that represent ice cream name and cost
    public String icName;
    private int icCost;

    /**
     * Ice cream constructor
     * @param name name of ice cream
     * @param cost cost of ice cream
     */
    public IceCream(String name, int cost){
        super(name);
        this.icCost = icCost;
        this.icName = name;
    }

    /**
     * Turns ice cream information into strings
     * @return returns ice cream name with proper formatting
     */
    public String toString(){
     String spaces = new String();
     int space = 30 - (this.icName.length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
     for(int i = 0; i < space; i++){
         spaces = spaces + " ";
     }
     return (this.icName + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    /**
     * getCost constructor holds cost of ice cream
     * @return returns cost of ice cream
     */
    @Override
    public int getCost(){
        return icCost;
    }
    
}
