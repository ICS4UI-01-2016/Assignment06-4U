
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author Thomas
 */
//icecream is a dessert item
public class IceCream extends DessertItem {

    //variable for class
    private int cost;

    //constructor takes a name and cost
    public IceCream(String name, int cost) {
        //sends name to dessert class
        super(name);
        //assign variable
        this.cost = cost;
    }

    @Override
    //method prints information to 'reciept' in proper format
    public String toString() {
        //convert from cents to dollars and convert the number to a string
        String costDollars = DessertShoppe.cents2dollarsAndCents(getCost());
        //calculate number of spaces that need to be added to get proper format
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costDollars.length();
        //put different elements of a reciept entry for icecream together in proper format
        String output = super.getName();
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
    //calculates cost of icecream
    public int getCost() {
        //return cost of icecream
        return this.cost;
    }

}
