package ss12.quan_ly_san_pham.model;

public class Product {
    String id;
    String productName;
   String quality;
    double price;
    double quantity;

    public Product() {
    }

    public Product(String id, String productName, double quality, double price, double quantity) {
        this.id = id;
        this.productName = productName;
        this.quality = String.valueOf(quality);
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", quality=" + quality +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


}
