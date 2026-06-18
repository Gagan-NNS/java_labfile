class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest: " + b.getInterestRate() + "%");
    }
}
