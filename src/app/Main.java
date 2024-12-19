package app;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0)
        );

        ProductGrouper grouper = new ProductGrouper(products);

        System.out.printf("Результат групування: %s%n", grouper.getAveragePricesGroupedByCategories());
        System.out.printf("Категорія з найбільшим average price: %s%n", grouper.getGroupWithMaxAveragePrice());
    }
}
