/**
 * Code by Jake Sherman, adapted from Oracle
 */

import java.util.Date;

/**
 * Main class will run the program.
 */
public class Main {
    /**
     * Main class and method will create 2 widget objects and print out the
     * product information through various classes.
     */
    public static void main(String args[]){

        Widget w1 = new Widget("Widget 1");
        System.out.println(w1.toString());

        Widget w2 = new Widget("Widget 2");
        System.out.println(w2.toString());

        //Comment......
    }

}
class Widget extends Product {

    public Widget(String name) {
        super(name);
    }

    @Override
    public Date getManufactureDate() {
        return null;
    }

    @Override
    public void setManufacturer(String manufacturer) {

    }
}