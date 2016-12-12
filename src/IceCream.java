
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    //inctance variables
    private int cost;

    /**
     * constructor for ice Cream
     *
     * @param name the name of the ice cream from the super class
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost) {


        //get the name from the super class
        super(name);
        //make the cost be this cost for this class
        this.cost = cost;


    }

    /**
     * out print this part of the recept
     *
     * @return the output
     */
    public String toString() {
        //make all prices line up   
        int width = DessertShoppe.RECEIPT_WIDTH;
        int width2 = width - (super.getName().length());
        //outprint name
        String output = this.getName();
        String icCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        output += String.format("%" + width2 + "s", icCost);


        return output;
    }

    @Override
    /**
     * return the cost of the ice cream
     */
    public int getCost() {
        return this.cost;
    }
}
