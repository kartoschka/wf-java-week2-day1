public class BankAccount {
    static double MIN_BALANCE_LOW_BOUND = -500;

    private String currency = "EUR";
    private double balance = 0;
    private double minBalance = 0;

    BankAccount(double initialDeposit) {
        balance = initialDeposit;
    }

    public void deposit(double value) {
        balance += value;
    }

    public boolean withdraw(double value) {
        if (balance - value >= minBalance) {
            balance = balance - value;
            System.out.println("withdrawing " + value + " " + currency);
            if (balance < 0) System.out.println("warning: negative balance");
            return true;
        } else {
            return false;
        }
    }

    public void report() {
        System.out.printf("The minimum balance is %.2f %s\n", minBalance, currency);
        System.out.printf("The current balance is %.2f %s\n", balance, currency);
    }

    public boolean setMinBalance(double minBalance) {
        if (minBalance >= MIN_BALANCE_LOW_BOUND) {
            this.minBalance = minBalance;
            return true;
        } else {
            return false;
        }
    }
}
