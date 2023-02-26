import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(ProductType.BOOK, 260, 10);
        Product product2 = new Product(ProductType.BOOK, 75, 5, LocalDateTime.of(2023,12,12,12,12,12));
        Product product3 = new Product(ProductType.BOOK, 270, 5);
        Product product4 = new Product(ProductType.PEN, 100);
        Product product5 = new Product(ProductType.PENCIL, 50, 10);
        Product product6 = new Product(ProductType.BOOK, 70, 10, LocalDateTime.of(2022,12,12,12,12,12));

        ProductService productService = new ProductService();
        productService.add(product1);
        productService.add(product2);
        productService.add(product3);
        productService.add(product4);
        productService.add(product5);
        productService.add(product6);

        System.out.println(productService);

        System.out.println(productService.findBooksPriceGreaterThan250());
        System.out.println(productService.findProductsDiscount10());
        System.out.println(productService.findCheapestBook());
        System.out.println(productService.findLast3AddedProducts());
        System.out.println(productService.findBooksPrice75ForLastYear());
        System.out.println(productService.groupByType());
    }
}
