
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

    public Cookie(String name, int number, int pricePer12) {
        // call to dessertitem constructor
        super(name, number, pricePer12);
    }

    @Override
    public String toString() {
        String output = this.getNumber() + " @ $" + pricePer12 + "/dz.";
        output = this.getName() + TAB + this.getCost();                         // how to do a tab
        return output;
    }

    @Override
    public void cost() {
        int perOne = pricePer12/12;
        return perOne * this.getNumber();
        }
    }
}
