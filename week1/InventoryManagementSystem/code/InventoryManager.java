package week1.InventoryManagementSystem.code;
import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int productId,
                              String newName,
                              int newQuantity,
                              double newPrice) {

        Product product = inventory.get(productId);

        if (product != null) {
            product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);

            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.remove(productId) != null) {
            System.out.println("Product Deleted Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Display Inventory
    public void displayInventory() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
