
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;

    }

    @Override
    public String toString() {
        System.out.println("printing candy");
        String output = this.weight + " @ " + this.pricePerLbs + "\n"
                +super.getName();
        //create a string to store the length of the cost 
        String lengthCost=DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many sapces are needed
      int s= DessertShoppe.RECEIPT_WIDTH-super.getName().length()-lengthCost.length();
              
        for(int i=0;i<=s;i++){
            output=output+ "";
        }
        System.out.println(lengthCost);
       
        return output;
    }

    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);

    }

}
