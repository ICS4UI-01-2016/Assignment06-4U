
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {

    private int cost;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.cost = pricePer12;
    }

    public int getCost() {
        return this.cost;
    }

    public String toString() {
        return "";
    }
}
