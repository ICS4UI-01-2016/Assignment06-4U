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
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12){
     super(name);
     this.number = number;
     this.pricePer12 = pricePer12;
        
    }

    @Override
    public String toString()
    {
        //convert cents to dollars using cens2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
     
        return  "Chocolate Chip Cookies      " + output ;

    }

   
    @Override
    public int getCost() {
        
         int cost = (Math.round(this.number/12)*this.pricePer12);
       return cost;
    }
    
}
