
class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

public class ReturnProduct {
    static Product createProduct() {
        return new Product("Laptop");
    }

    public static void main(String[] args) {
        Product p = createProduct();
        System.out.println("Product: " + p.name);
    }
}
