/**
 * Code by Jake Sherman, adapted from Oracle
 */

import java.util.Date;

/**
 * The abstract class named Product will implement the interface "Item".
 * The class contains all the different information for the current product.
 */
public abstract class Product implements Item {

    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;

    static int currentProductNumber;

    /**
     * Gets the values for name, serialNumber, and manufacturedOn
     * @param name
     */
    public Product(String name){
        this.name = name;
        serialNumber = currentProductNumber++;
        manufacturedOn = new Date();
    }

    /**
     * Sets the serial number for the product
     * @param productionNumber
     */
    public void setProductionNumber(int productionNumber){
        serialNumber = productionNumber;
    }

    /**
     * Sets the name of the product
     * @param name
     */
    public void setName(String name){
            this.name = name;
    }

    /**
     * Gets the name for the product and returns its value to name.
     * @return
     */
    public String getName(){
            return name;
    }

    /**
     * Gets the manufactured date and returns its value to manufacturedOn.
     * @return
     */
    public Date getManufacturedDate(){
            return manufacturedOn;
    }

    /**
     * Gets the serial number and returns its value to serialNumber.
     * @return
     */
    public int getSerialNumber(){
            return serialNumber;
    }

    /**
     * Prints out the information for the product
     * @return
     */
    public String toString(){
            return    "Manufacturer  : " + manufacturer   + "\n"
                    + "Serial Number : " + serialNumber   + "\n"
                    + "Date          : " + manufacturedOn + "\n"
                    + "Name          : " + name           + "\n";
    }
}
