
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    private int cost;
    private String name;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public String toString() {
        String output = this.getName();

        //spaces available
        int width = DessertShoppe.RECEIPT_WIDTH;
        int outputLength = this.getName().length();
        //finding length of output
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        outputLength = outputLength + costLength;
        //find the remaining space between total space and used up space from strings
        int space = width - outputLength;
        for (int i = 0; i < space; i++) {
            output = output + " ";
        }
        output = output + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }

    public int getCost() {
        return this.cost;
    }
}
