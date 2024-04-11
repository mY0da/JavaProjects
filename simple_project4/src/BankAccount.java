public class BankAccount {
    protected double balance;

    public void deposit(double value) {
        balance += value;
        System.out.println("Done deposit of " + value);
    }

    public void withdraw(double value) {
        if (value <= balance) {
            balance -= value;
            System.out.println("Done withdraw of " + value);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void getBalance() {
        System.out.println("Current balance: " + balance);
    }
}
