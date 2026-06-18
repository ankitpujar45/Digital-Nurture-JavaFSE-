public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 20, 55000);
        Product p2 = new Product(102, "Mouse", 100, 500);
        Product p3 = new Product(103, "Keyboard", 50, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInventory:");
        manager.displayInventory();

        System.out.println("\nUpdating Product 102...");
        manager.updateProduct(102, "Wireless Mouse", 80, 700);

        System.out.println("\nInventory After Update:");
        manager.displayInventory();

        System.out.println("\nDeleting Product 103...");
        manager.deleteProduct(103);

        System.out.println("\nFinal Inventory:");
        manager.displayInventory();
    }
}
