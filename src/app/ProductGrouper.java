package app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductGrouper {
    private final List<Product> products;

    public ProductGrouper(List<Product> products) {
        this.products = products;
    }

    public Map<String, Double> getAveragePricesGroupedByCategories() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
    }

    public Map.Entry<String, Double> getGroupWithMaxAveragePrice() {
        return getAveragePricesGroupedByCategories()
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
    }
}
