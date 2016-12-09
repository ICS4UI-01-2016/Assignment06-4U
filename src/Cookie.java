
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem{

    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    public int getNumber(){
        return this.number;
    }
    
    public double getPricePer12(){
        return this.pricePer12;
    }
    
    @Override
    public String toString() {
        String output = this.getNumber() + " @ $ " + this.getPricePer12()*0.01 
                      + " /dz " + this.getName() + this.getCost()*0.01;
        return output;
    }
    
    @Override
    public int getCost() {
        double cost = this.number*this.pricePer12;
        return (int)(Math.round(cost)); 
    }
}
