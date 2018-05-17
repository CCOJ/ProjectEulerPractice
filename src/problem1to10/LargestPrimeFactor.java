package problem1to10;

import java.util.ArrayList;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {

    private long number;
    private ArrayList<Long> primeNumbers = new ArrayList<>();

    /**
     * Sets the number to be divided and computes the primeNumbers ArrayList
     * @param number
     */
    public LargestPrimeFactor(long number) {
        this.number = number;
        computePrimes();
    }

    /**
     * Computes and stores the list of primes in the ArrayList
     */
    private void computePrimes() {
        long value = number;

        /**
         * Checks to see if the number is divisible by i.
         * If divisible, adds the prime number to the list.
         */
        for (int i = 2; value > 1; i++) {
            if (value % i == 0) {
                value /= i;
                primeNumbers.add((long) i);
            }
        }
    }

    /**
     * Gets the number that is being divided
     * @return
     */
    public long getNumber() {
        return number;
    }

    /**
     * Gets the largest prime which is the last value in the ArrayList
     * @return Largest Prime
     */
    public long getLargestPrime() {
        return primeNumbers.get(primeNumbers.size() - 1);
    }

    /**
     * Returns a string that shows both the number and largest prime
     */
    public String toString() {
        return "Largest Prime of " + getNumber() +
                " is: " + getLargestPrime();
    }

    /**
     * Tests problem 3
     */
    public static void main(String[] args) {
        long value = 600851475143L;
        LargestPrimeFactor problem3 = new LargestPrimeFactor(value);
        System.out.println(problem3);
    }
}
