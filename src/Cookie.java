/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem{
    //create private variables
    private int number;
    private int pricePer12;
     
    
    public Cookie(String name, int number, int pricePer12){
        //store name of candy in the super class
     super(name);
     
     this.number = number;
     this.pricePer12 = pricePer12;
        
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
        int cost = Math.round((this.number*this.pricePer12)/12);
         
       return cost;
    }
    
}
