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

    
    public String toString(){
        String output = this.getName() + ", "
                + this.number + ", "
                + this.pricePer12;
        return output;
    }
    
    @Override
        public int getCost(){
        int cost = (this.number * this.pricePer12) / 12;
        return (int)cost;
    }
    
}
