
/**
 * Abstract superclass for Dessert Item hierarchy
 *
 * This class represents a generic dessert item for the inheritance/polymorphism
 * assignment. All other dessert items will be inheriting from this class. DO
 * NOT CHANGE THIS CLASS!
 *
 * @author lamonta
 */
public abstract class DessertItem {

    private String name;
    private int number;
    private int cost;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this.name = name;
        this.number = number;
        this.cost = cost;
    }

    /**
     * Initializes DessertItem data
     *
     * @param name The name of the dessert item being created.
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * Returns name of DessertItem
     *
     * @return name of DessertItem
     */
    public final String getName() {                       // what does this do?
        return this.name;
    }

    /**
     * Returns number of items
     * @return number of items
     */
    public int getNumber(){
        return this.number;
    }
    
    /**
     * Returns cost of DessertItem
     *
     * @return cost of DessertItem
     */
    public abstract int getCost();
}
