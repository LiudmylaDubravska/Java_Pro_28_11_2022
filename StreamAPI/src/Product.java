import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private ProductType type;
    private double price;
    private int discount;
    private LocalDateTime createdAt;

    private static final AtomicInteger NEXT_ID = new AtomicInteger(0);
    private int id = NEXT_ID.incrementAndGet();
    public Product(ProductType type, double price) {
        this(type, price, 0, LocalDateTime.now());
    }

    public Product(ProductType type, double price, int discount) {
        this(type, price, discount, LocalDateTime.now());
    }

    public Product(ProductType type, double price, int discount, LocalDateTime createdAt) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", price=" + price +
                ", discount=" + discount +
                ", price with discount=" + getPriceWithDiscount() +
                ", created at =" + createdAt +
                ", id =" + id +
                '}';
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithDiscount() {
        return getPrice() - (getPrice()*getDiscount())/100;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
