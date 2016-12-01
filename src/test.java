/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Checkout checkout = new Checkout();
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        System.out.println(checkout);
    }
}
