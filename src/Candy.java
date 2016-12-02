
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
         //store length of cost 
        String lengthCost=DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int width= DessertShoppe.RECEIPT_WIDTH-super.getName().length()-lengthCost.length();
        //al information is set before the price is added
        String output=this.weight+ " lbs " +"@ $"+ DessertShoppe.cents2dollarsAndCents(this.pricePerLbs)+"/dz\n"+
                super.getName();
       //add the required amount of spaces
        for(int i=0;i<=width;i++){
            output+="";
        }
        //add the price to the end of the line 
       output+=DessertShoppe.cents2dollarsAndCents(this.getCost());
       //return 
        return output;
        
        
        
    }

    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);

    }

}
