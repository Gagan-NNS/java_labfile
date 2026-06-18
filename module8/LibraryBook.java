class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class LibraryBook {
    static Book updateBook(Book b) {
        b.title = "Advanced Java";
        return b;
    }

    public static void main(String[] args) {
        Book b = new Book("Java");
        b = updateBook(b);
        System.out.println(b.title);
    }
}
