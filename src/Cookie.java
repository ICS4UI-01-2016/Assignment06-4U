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
    
    //the inctance variables
    private int number;
    private int pricePer12;
    
    /**
     * constructor for cookie
     * @param name get the name of the cookie
     * @param number get how many cookies there is
     * @param pricePer12 get the price per 12 cookies
     */
    public Cookie(String name, int number, int pricePer12){
        
        //get the name from the super class
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }
    
    
    

    /**
     * to output this part of the recept
     * @return the output 
     */
    public String toString(){
        //make all prices line up
        int width = DessertShoppe.RECEIPT_WIDTH;
        int width2 = width - (super.getName().length());
        //outprint the nmae
        String output = this.number + "@ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz \n" + this.getName();
        String cookieCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        output += String.format("%" + width2 + "s", cookieCost);
        
        
        return output;
    }

    @Override
    /**
     * get the cost of the cookie
     */
    public int getCost() {
        
       int price = (int) Math.round(this.number / 12.0 * this.pricePer12);
        return price;
    }
    
}
