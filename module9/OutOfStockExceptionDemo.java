import java.util.Scanner;

class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}

public class OutOfStockExceptionDemo {

    static void checkStock(int stock, int quantity)
            throws OutOfStockException {

        if (quantity > stock) {
            throw new OutOfStockException(
                    "Requested quantity exceeds available stock.");
        }

        System.out.println("Order Placed Successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Available Stock: ");
            int stock = sc.nextInt();

            System.out.print("Requested Quantity: ");
            int quantity = sc.nextInt();

            checkStock(stock, quantity);

        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
