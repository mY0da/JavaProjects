//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarModel myCar = new CarModel();
        myCar.setModel("Sedan");
        myCar.setPrices(30000, 32000, 35000);
        myCar.showInfo();

        Dog dog = new Dog();
        dog.makeSound();
        dog.shakeTail();

        Cat cat = new Cat();
        cat.makeSound();
        cat.scratchFurniture();

        BankAccount account = new BankAccount();
        account.deposit(100);
        account.getBalance();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(200);
        currentAccount.monthlyFeeCharge();
        currentAccount.getBalance();
        currentAccount.withdraw(150);
        currentAccount.getBalance();

        PrimeVerifier verifier = new PrimeVerifier();
        verifier.verifyIfPrime(17);

        PrimeGenerator generator = new PrimeGenerator();
        int nextPrimeNumber = generator.generateNextPrime(17);
        System.out.println("The next prime number is: " + nextPrimeNumber);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimes(30);
    }
}