import java.util.LinkedHashMap;
import java.util.Map;

public class InventoryManager {
    private final Map<Integer, Product> inventory = new LinkedHashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);

        if (product == null) {
            System.out.println("Product with ID " + productId + " not found.");
            return;
        }

        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setPrice(price);
    }

    public void deleteProduct(int productId) {
        if (inventory.remove(productId) == null) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
