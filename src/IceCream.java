
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
        // call to dessertitem constructor
        super(name);
    }

    public String toString() {
        String output = this.getName() + "     " + cost;
        return output;
    }
    
    @Override
    public int getCost() {
        return cost;
    }
}
