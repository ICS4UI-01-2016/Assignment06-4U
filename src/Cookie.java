
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and
 * the price per dozen cookies.
 * The number and price per dozen are used to calculate the cost of the cookies.
 *
 * @author Thomas
 */
//cookie is a dessert item
public class Cookie extends DessertItem {

    //variables for class
    private int numberCook;
    private int per12;

    //constructor for cookie
    //takes a name, number and price per dozen
    public Cookie(String name, int number, int pricePer12) {
        //send name to dessert class
        super(name);
        //assign variables
        this.numberCook = number;
        this.per12 = pricePer12;
    }

    @Override
    //method prints information to 'reciept' in proper format
    public String toString() {
        //convert from cents to dollars and convert the number to a string
        String costDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate number of spaces that need to be added to get proper format
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costDollars.length();
        //put different elements of a reciept entry for cookies together in proper format
        String output = this.numberCook + " @ $" + DessertShoppe.cents2dollarsAndCents(this.per12) + " /dz" + "\n"
                + super.getName();
        //add appropriate number of spaces between name and cost
        for (int i = 0; i < width; i++) {
            output += " ";
        }
        //add cost to end
        output += costDollars;
        //return output
        return output;
    }

    @Override
    //calculates cost of cookies
    public int getCost() {
        //multiply cost per dozen by number of dozens
        return (int) Math.round((this.per12 * this.numberCook / 12));
    }

}
