package week1.EcommercePlatform.code;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Headphones", "Audio")
        };

        int targetId = 104;

        System.out.println("Linear Search:");

        Product result1 =
                SearchAlgorithms.linearSearch(products, targetId);

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search:");

        Product result2 =
                SearchAlgorithms.binarySearch(products, targetId);

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found");
        }
    }
}
