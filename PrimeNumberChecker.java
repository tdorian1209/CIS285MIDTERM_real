public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 256; // Hardcoded input number

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number. I changed this text");
        } else {
            System.out.println(number + " is not a prime number.I changed this for question 2");
        }

        System.out.println("List of prime numbers up to " + number + ":" + "final change made here");
        for (int i = 2; i <= number; i++) {
            boolean isPrimeCheck = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeCheck = false;
                    break;
                }
            }
            if (isPrimeCheck) {
                System.out.print(i + " ");
            }
        }
    }
}
