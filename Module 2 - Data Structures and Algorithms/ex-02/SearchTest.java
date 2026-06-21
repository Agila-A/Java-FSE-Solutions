public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(104, "Mouse", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(102, "Phone", "Electronics")

        };

        System.out.println("Linear Search:");

        Product result = SearchAlgorithms.linearSearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product Not Found");

        SearchAlgorithms.sortProducts(products);

        System.out.println("\nBinary Search:");

        result = SearchAlgorithms.binarySearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product Not Found");

    }
}