
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

    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public int getCost() {
        int price = (int) Math.round((number / 12.0) * pricePer12);
        return price;
    }

    @Override
    public String toString() {
        int width = DessertShoppe.RECEIPT_WIDTH;
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int rSpaces = width - super.getName().length();
        
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz \n" + super.getName();
        
        output += String.format("%" + rSpaces + "s%n", cost);
        return output;
    }

}
