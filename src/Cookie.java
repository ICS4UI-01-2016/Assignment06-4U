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
    
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number=number;
        this.pricePer12=pricePer12;
    }

    
    public String toString()
    {
        String output=this.number+ " @ " + this.pricePer12+"\n"+
                super.getName();
        //store length of cost 
        String lengthCost=DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate how many spaces are needed
        int s= DessertShoppe.RECEIPT_WIDTH-super.getName().length()-lengthCost.length();
              
        for(int i=0;i<=s;i++){
            output=output+ "";
        }
        System.out.println(lengthCost);
       
        return output;
        
        
        
        
    }
    
    
    public int getCost(){
       return (int)Math.round(number*pricePer12);
}
}
