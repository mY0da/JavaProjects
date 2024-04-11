public class PrimeVerifier extends PrimeNumbers {
    public void verifyIfPrime(int number) {
        if (verifyPrimality(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
