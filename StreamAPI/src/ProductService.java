import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class ProductService {
    List<Product> productList = new ArrayList<>();


    public void add(Product product){
        productList.add(product);
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "productList=" + productList +
                '}';
    }

    public List<Product> findBooksPriceGreaterThan250() {
        return productList.stream()
                .filter(product -> product.getPrice()>250)
                .filter(product ->  product.getType()==ProductType.BOOK)
                .collect(Collectors.toList());
    }

    public List<Product> findProductsDiscount10() {
        return productList.stream()
                .filter(product -> product.getDiscount()==10)
                .collect(Collectors.toList());
    }

    public Product findCheapestBook() {
        return  productList.stream()
                .filter(product ->  product.getType()==ProductType.BOOK)
                .min((o1, o2) -> Double.compare(o1.getPrice(),o2.getPrice()))
                .orElseThrow(() -> new RuntimeException("Продукт [категорія: " + ProductType.BOOK + "] не знайдено"));
    }

    public List<Product> findLast3AddedProducts() {
        return productList.stream()
                .sorted((o1, o2) -> o2.getCreatedAt().compareTo(o1.getCreatedAt()))
                .limit(3)
                .collect(Collectors.toList());
    }
    public List<Product> findBooksPrice75ForLastYear(){
        LocalDateTime thisYearFirstDay = LocalDateTime.now()
                .withMonth(1)
                .withDayOfMonth(1)
                .withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);
        return productList.stream()
                .filter(product ->  product.getType()==ProductType.BOOK)
                .filter(product -> product.getPrice() <= 75.0)
                .filter(product -> product.getCreatedAt().compareTo(thisYearFirstDay) > 0)
                .collect(Collectors.toList());
    }

    public Map<ProductType, List<Product>> groupByType(){
        return productList.stream().collect(groupingBy(Product::getType));
    }
}
