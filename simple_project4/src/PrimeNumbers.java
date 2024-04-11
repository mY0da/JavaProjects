public class PrimeNumbers {
    public boolean verifyPrimality(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listPrimes(int limit) {
        System.out.println("Prime numbers until " + limit + ": ");
        for (int i = 2; i <= limit; i++) {
            if (verifyPrimality(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
