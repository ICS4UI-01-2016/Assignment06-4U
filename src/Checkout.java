
/**
 * The class represents a checkout till at a dessert shoppe. The user can add
 * items to the receipt or clear the till They can also print out the receipt
 * with the taxes
 *
 * DO NOT MODIFY THIS FILE
 *
 * @author lamonta
 */
public class Checkout {

    // Create instance variables (will be used)
    // The number of items bought
    private int numItems;
    // The array of items bought
    private DessertItem[] desserts;

    /**
     * Creates a new, empty checkout
     */
    public Checkout() {
        numItems = 0;
        desserts = new DessertItem[100];
    }

    /**
     * Method that adds an item to the receipt
     *
     * @param item the dessert to add to the receipt
     */
    public void enterItem(DessertItem item) {
        desserts[numItems] = item;
        numItems++;
    }

    /**
     * Method that clears all items from a receipt
     */
    public void clear() {
        for (int i = 0; i < numItems; i++) {
            desserts[i] = null;
        }
        numItems = 0;
    }

    /**
     * Method that creates a formatted receipt from the till
     *
     * @return a formatted receipt with all items, prices, and taxes listed
     */
    public String toString() {
        // Create the receipt header
        String output = "";
        output += DessertShoppe.STORE_NAME + "\n";
        output += "--------------------\n";
        output += "Number of Items: " + numItems + "\n\n";

        // List all the desserts ordered
        int preCost = 0;
        for (int i = 0; i < numItems; i++) {
            output += desserts[i] + "\n";
            preCost += desserts[i].getCost();
        }
        // Print the output and add another line underneath
        output += "\n";

        // Create the subtotal
        output += "Subtotal";

        // Format the subtotal amount using the cents2dollars method and the String format method
        // see https://docs.oracle.com/javase/tutorial/java/data/strings.html
        // and http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf
        // For more info about the String format
        // We subtract 8 from the width because there are 8 letters in subtotal
        String preTax = DessertShoppe.cents2dollarsAndCents(preCost);
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - 8;
        output += String.format("%" + widthPreTax + "s%n", preTax);

        // Calculate the taxes
        output += "Tax";
        int tax = (int) Math.round(preCost * DessertShoppe.TAX_RATE / 100.0);
        String taxS = DessertShoppe.cents2dollarsAndCents(tax);
        // Format the spacing for the tax amount
        // We subtract 3 because of the 3 letters in Tax
        int widthTax = DessertShoppe.RECEIPT_WIDTH - 3;
        output += String.format("%" + widthTax + "s%n", taxS);

        // Calculate the total
        output += "Total";
        int total = preCost + tax;
        String totalS = DessertShoppe.cents2dollarsAndCents(total);
        // Format the total
        // WFe subtract 5 because of the 5 letters in total
        int widthTotal = DessertShoppe.RECEIPT_WIDTH - 5;
        output += String.format("%" + widthTotal + "s%n", totalS);

        // Returns the receipt to be printed
        return output;
    }

}
