class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    Book(Book b) {
        this.title = b.title;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 499);
        Book b2 = new Book(b1);

        b1.display();
        b2.display();
    }
}
