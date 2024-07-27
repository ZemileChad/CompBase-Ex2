/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplicationV2;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer app;
        //Customer app = CustomerFactory.createCustomer("Delinquent");
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app = CustomerFactory.createCustomer("Regular");
                System.out.println(app);
                break;
            case 2:
                app = CustomerFactory.createCustomer("Mountain");
                System.out.println(app);
                break;
            case 3:
                app = CustomerFactory.createCustomer("Delinquent");
                System.out.println(app);
                break;
            
        }
                
    }
}
