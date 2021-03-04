package database;
import Domain.Customer;
import exceptions.LoginException;
import java.util.ArrayList;


public class CustomerDA {
    
    // find by userID
    public static Customer findByUserID(String userID)throws LoginException{
     for(int i = 0; i<customerList.size();i++){
         if(customerList.get(i).getUserID().equals(userID))
             System.out.print( userID +"CustomerDA");
                return customerList.get(i);
     }
     LoginException e = new LoginException("User ID " +userID+ "not found");
     throw e;
    }
    
    //
    private static ArrayList<Customer> customerList = new ArrayList<Customer> (5);
    
    public static void add(Customer c) {
        customerList.add(c);
    }
    
    public static Customer find(int id) {
        for(int i = 0; i < customerList.size(); i++)
            if(customerList.get(i).getCustomerId() == id)
                return customerList.get(i);
        return null;
    }
    
    public static Customer get(int i) {
        return customerList.get(i);
    }
    
    public static int getNumberOfCustomers() {
        return customerList.size();
    }
    
    public static void initialize(){
        Customer c;
        
        c = new Customer();
        c.setCustomerId(100);
        c.setCustomerName("Customer One");
        c.setCustomerPhoneNumber("555-555-8704");
        c.setUserID("cust1");
        c.setPassword("cust1");
        c.add();
       
        c = new Customer();
        c.setCustomerId(200);
        c.setCustomerName("Customer Two");
        c.setCustomerPhoneNumber("555-555-8702");
        c.setUserID("cust2");
        c.setPassword("cust2");
        c.add();
       
        c = new Customer();
        c.setCustomerId(300);
        c.setCustomerName("Customer Three");
        c.setCustomerPhoneNumber("555-555-8404");
        c.setUserID("cust3");
        c.setPassword("cust3");
        c.add();
    }
    
}
