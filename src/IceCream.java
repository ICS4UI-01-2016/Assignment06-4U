
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    private int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public String toString() {
        //store length of cost 
        String lengthCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - lengthCost.length();
        //set the name
        String output = super.getName();
        //add the required amount of spaces
        for (int i = 0; i <= width; i++) {
            output += "";
        }
        //add the price 
        output += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //return
        return output;

    }

    public int getCost() {
        return cost;
    }

}
