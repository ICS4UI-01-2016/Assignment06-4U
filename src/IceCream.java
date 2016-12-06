
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author laurelizall
 */
public class IceCream extends DessertItem {

    private int cost;

    public IceCream(String name, int cost) {
        // call to DessertItem constructor
        super(name);
        this.cost = cost;
    }

    public String toString() {
        String output = this.getName();
        // how many spaces
        int width = DessertShoppe.RECEIPT_WIDTH;
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        // name + cost length
        int outputLength = this.getName().length() + costLength;
        
        // add costLength to the outputLength
        int remainingSpace = width - outputLength;
        
        // insert enough spaces to make the layout equal
        for (int i = 0; i < remainingSpace; i++) {
            output = output + " ";
        }
        output = output + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }
    
    @Override
    public int getCost() {
        return cost;
    }
}
