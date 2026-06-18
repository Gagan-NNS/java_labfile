class Mobile {
    double price;

    Mobile(double price) {
        this.price = price;
    }
}

public class UpdateMobile {
    static void applyDiscount(Mobile m) {
        m.price -= 1000;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile(20000);
        applyDiscount(m);
        System.out.println("Discounted Price: " + m.price);
    }
}
