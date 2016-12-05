
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

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }

    /**
     * Method that initializes DessertItem data
     *
     * @param name The name of the dessert item being created.
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * Method that returns name of DessertItem
     *
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    /**
     * Method that returns cost of DessertItem
     *
     * @return cost of DessertItem
     */
    public abstract int getCost();

}
