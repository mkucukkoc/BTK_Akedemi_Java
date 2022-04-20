/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorpishm.and.overridin;

/**
 *
 * @author Mustafa
 */
public class PolimorpishmAndOverridin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CustomerManager customer =new CustomerManager(new DatabaseLogger());
        customer.add();
    }
    
}
