class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
}

public class ReturnBankAccount {
    static BankAccount createAccount() {
        return new BankAccount(5000);
    }

    public static void main(String[] args) {
        BankAccount acc = createAccount();
        System.out.println("Balance: " + acc.balance);
    }
}
