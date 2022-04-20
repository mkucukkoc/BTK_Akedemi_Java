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
public class CustomerManager
{
private BaseLogger logger;
public CustomerManager(BaseLogger logger)
{
this.logger=logger;
}
public void add()
{
System.out.println("Müşteri Eklendi....");
this.logger.log("Log mesajı");
}  
}
