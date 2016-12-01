
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

    public int getCost() {
        return this.cost;
    }

    public String toString() {
        return "";
    }
}
