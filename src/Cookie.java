
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
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz." + "\n";
        output = output + this.getName();
        
        // how many spaces?
        int width = DessertShoppe.RECEIPT_WIDTH;
        int outputLength = this.getName().length();
        
        // add costLength to the outputLength
        int costLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        outputLength = outputLength + costLength;
        int remainingSpace = width - outputLength;
        
        // insert enough spaces to make the layout equal
        for (int i = 0; i < remainingSpace; i++) {
            output = output + " ";
        }
        // save string length
        output = output + DessertShoppe.cents2dollarsAndCents(this.getCost());
        return output;
    }

    @Override
    public int getCost() {
        int price = (int) Math.round(this.number / 12.0 * this.pricePer12);
        return price;
    }
}