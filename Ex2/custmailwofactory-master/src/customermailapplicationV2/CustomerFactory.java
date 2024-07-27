/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplicationV2;

/**
 *
 * @author DoubleX
 */
public class CustomerFactory {
    
    public static Customer createCustomer(String customerType) {
        if (customerType.equals("Delinquent")) 
            return new DelinquentCustomer();
	else if (customerType.equals("Mountain"))
            return new MountainCustomer();
        else if (customerType.equals("Regular"))
            return new RegularCustomer();
	
        return null;
    }
    /*public String generateMail() {
        return customer.createMail();
    }*/

}
