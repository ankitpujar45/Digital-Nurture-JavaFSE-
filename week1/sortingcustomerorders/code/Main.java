package week1.sortingcustomerorders.code;

public class Main {
    public static void Printorders(Order[] orders){
        for(Order order : orders){
            System.out.println(order);
        }
    }

    public static void main(String[] args){
        Order[] order = {

            new Order(101, "Ankit", 4500);
            new Order(102, "Rahul", 1200),
            new Order(103, "Priya", 8000),
            new Order(104, "Amit", 3000),
            new Order(105, "Sneha", 6000)
        };

        System.out.println("Original Orders: ");
        printOrders(orders1);

        BubbleSort.sort(orders1);

        System.out.println("After Bubble Sort: ");
        printOrders(orders1);

        Order[] orders2 = {

                new Order(101, "Ankit", 4500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Priya", 8000),
                new Order(104, "Amit", 3000),
                new Order(105, "Sneha", 6000)
        };

        QuickSort.sort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");
        printOrders(orders2);


    }
}

