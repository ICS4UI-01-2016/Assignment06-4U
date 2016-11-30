/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {
    
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    public int getNumber(){
        return number;
    }
    
  
    
    
    @Override
    public String toString()
    {
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        return  super.getName() + " " + output;
    }

    @Override
    public int getCost() {
       //the integer which returns the cost of ONE Cookie, therefore divide number by 12 (e.g 24/12 = 2 dozens)
        int cost = ((this.number) * this.pricePer12)/12;
      
        return cost;
    }
    
}
