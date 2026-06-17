class Mobile {
    String brand;
    int price;

    Mobile() {
        brand = "Samsung";
        price = 15000;
    }

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple", 80000);

        m1.display();
        m2.display();
    }
}
