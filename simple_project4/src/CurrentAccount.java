public class CurrentAccount extends BankAccount{
    private double monthlyFee = 10;

    public void monthlyFeeCharge() {
        balance -= monthlyFee;
        System.out.println("Monthly fee of " + monthlyFee + " charged. Current balance: " + balance);
    }
}
