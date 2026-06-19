import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class InsufficientBalanceExceptionDemo {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Withdrawal amount exceeds balance.");
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
