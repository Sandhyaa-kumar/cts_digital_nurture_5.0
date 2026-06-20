
import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "productId:"+ productId + "\nProductName:" + productName + " \nCategory:" + category + " ";
    }
}

public class  ECommercePlatform {

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shirt", "Clothing"),
            new Product(4, "Shoes", "Footwear")
        };

        Product result1 = linearSearch(products, "Shirt");
        System.out.println("Linear Search: " + result1);

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product result2 = binarySearch(products, "Shirt");
        System.out.println("Binary Search: " + result2);
    }

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
/* output
Linear Search: productId:3
ProductName: Shirt 
Category: Clothing 
Binary Search: productId:3
ProductName: Shirt 
Category: Clothing 
 */
/*
Binary search is effcient than linear search because it reduces the number of comparisons needed to find an element. In a linear search, each element is checked one by one until the target is found or the end of the list is reached, resulting in a time complexity of O(n). In contrast, binary search divides the sorted list in half with each comparison, leading to a time complexity of O(log n). This makes binary search significantly faster for large datasets, as it quickly narrows down the possible locations of the target element.  

 */
