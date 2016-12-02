
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

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        int width = DessertShoppe.RECEIPT_WIDTH;
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int rSpaces = width - super.getName().length();

        String output = super.getName();

        output += String.format("%" + rSpaces + "s%n", cost);
        return output;
    }
}
