package Domain;
import database.CustomerDA;
import exceptions.LoginException;
public class Customer {
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;
    private String userID;
    private String Password;
   
//find by user id
    public static Customer findByUserID(String userID)throws LoginException{
        return CustomerDA.findByUserID(userID);
    }

//process
    public static  Customer processLogin(String userID , String password) throws LoginException{
        Customer customer = null;
        try{
           customer = findByUserID(userID);
          System.out.println( userID +"Customer");
        }
        catch(LoginException e){
            
        }
       
       return customer;
    }

// new get and sets
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return Password;
    }

    
    public void setPassword(String Password) {
        this.Password = Password;
    }

    ///
    public void add() {
        CustomerDA.add(this);
    }
    
    public static Customer find(int id){
        return CustomerDA.find(id);
    }
    
    public static Customer get(int i) {
        return CustomerDA.get(i);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public static int getNumberOfCustomers() {
        return CustomerDA.getNumberOfCustomers();
    }
   
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    
    public static void initialize(){
        CustomerDA.initialize();
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }
  
    public void setCustomerPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNumber=" + customerPhoneNumber + '}';
    }
    
   
}
