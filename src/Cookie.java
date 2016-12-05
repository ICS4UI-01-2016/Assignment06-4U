
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

    private String name;
    private int pricePer12;
    private int number;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
         String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz  \n";
        output = output + this.getName();
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
    
    @Override
     public int getCost() {
        int price = (int) Math.round(this.number / 12.0 * this.pricePer12);
        return price;
    }
}
