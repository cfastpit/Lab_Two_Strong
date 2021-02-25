package Domain;
import database.InventoryDA;
public class Inventory {
    
    String description;
    private double price;
    private int productId;
    private int quantityOnHand;
    
    public void add() {
        InventoryDA.add(this);
    }
    
    public static Inventory find(int id) {
        return InventoryDA.find(id);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }
    
    public static Inventory get(int i){
        return InventoryDA.get(i);
    }
    
    public static int getNumberOfInventory(){
        return InventoryDA.getNumberOfInventory();
    }
    
    public static void initialize(){
        InventoryDA.initialize();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
    
    public String toString() {
        return productId + "  " + description + "   " + price + "   " + quantityOnHand; 
    }
}

