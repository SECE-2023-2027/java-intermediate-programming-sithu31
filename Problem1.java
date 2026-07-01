class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price < 0 ? 0.0 : price; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity < 0 ? 0 : stockQuantity; }

    public void applyDiscount(double percentage) {
        this.price = this.price * (1 - percentage / 100.0);
        if (this.price < 0) {
            this.price = 0.0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Product p = new Product("P101", "Laptop", 1000.0, 15);
        p.applyDiscount(10);
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
    }
}
