
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author laurelizall
 */
public class Cookie extends DessertItem {

    private int cost;
    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        // call to dessertitem constructor
        super(name);
        this.cost = pricePer12;
    }

    @Override
    public String toString() {
        int width = DessertShoppe.RECEIPT_WIDTH;
        String output = this.number + " @ $" + pricePer12 + "/dz.";
        int outputLength = output.length();
        int remainingSpace = width - outputLength;
        output = this.getName();
        // insert enough spaces to make the layout equal
        for (int i = 0; i < remainingSpace; i++){
            System.out.print(" ");
        }
        output = this.getCost() + "";                      // how to do a tab
        return output;
    }

    @Override
    public int getCost() {
        int perOne = pricePer12 / 12;
        return perOne * this.number;
    }
}