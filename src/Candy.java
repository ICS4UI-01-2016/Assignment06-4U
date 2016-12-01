/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    //create private variables
    private double weight;
    private int pricePerLbs;

    //contructor for candy
    public Candy(String name, double weight, int pricePerLbs)
            //store name of candy in the super class
    {super(name);
    this.weight = weight;
    this.pricePerLbs = pricePerLbs;
    }

 
    @Override
    public String toString()
    {
       //convert cents to dollars using cens2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //create string storing cost in a string 
        String costLength = Integer.toString(this.getCost());
        //find spacing needed between name and cost in reciept by subtracting 30(total spaces) by 
        //length of name and length of cost
        int spacing = 30- super.getName().length() - costLength.length() - 1;
        //loop through an add a space each time up to "spacing" integer
     for(int i = 0; i < spacing ; i ++){
         output = " " +output ;
     }
     //return name of cookie along with cost
        return  this.getName() + output ;
    }

    
    @Override
    public int getCost() {
        double cost = Math.round(this.weight*this.pricePerLbs);
        
        //return cost converted to int
        return (int) cost;
    }
}
