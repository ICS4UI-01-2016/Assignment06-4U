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
    
    //private integers represent number of cookies and the price per 12 cookies
    private int number;
    private int pricePer12;
    
    /**
     * Cookie constructor holds all information about the cookie
     * @param name name of cookie
     * @param number number of cookies
     * @param pricePer12 price per 12 cookies
     */
    public Cookie(String name, int number, int pricePer12){
     super(name);
     this.number = number;
     this.pricePer12 = pricePer12;
    }

    /**
     * Turns cookie information into strings
     * @return returns strings of cookie information
     */
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
