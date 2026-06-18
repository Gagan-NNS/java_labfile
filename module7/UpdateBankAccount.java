class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
}

public class UpdateBankAccount {
    static void deposit(BankAccount acc, double amount) {
        acc.balance += amount;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        deposit(acc, 500);
        System.out.println("Balance: " + acc.balance);
    }
}
