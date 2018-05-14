/**
 * Multiples of 3 and 5
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
package problem1to10;

public class Multiples3or5 {

    private int high, sum;

    public Multiples3or5(int high) {
        this.high = high;
        sum = computeSum();
    }

    /**
     * Computes a sum up to the input high value
     * @return computeSum; The computed sum of multiples 3 or 5
     */
    private int computeSum() {
        int computeSum = 0; //Default sum if high is less than 3

        /**
         * Add multiples of 3 to sum
         */
        for (int i = 3; i < high; i += 3) {
            computeSum += i;
        }

        /**
         * Add multiples of 5 to sum
         */
        for (int i = 5; i < high; i += 5) {
            computeSum += i;
        }

        /**
         * Subtract duplicate multiples of 15 or (3*5) from sum
         */
      for (int i = 15; i < high; i += 15) {
           computeSum -= i;
       }

        return computeSum;
    }

    public int getHigh() {
        return high;
    }

    public int getSum() {
        return sum;
    }

    public String toString() {
        return "High: " + getHigh() +
                "\nSum: " + getSum();
    }

    public static void main(String[] args) {
        int high = 1000;
        Multiples3or5 problem1 = new Multiples3or5(high);
        System.out.println(problem1);
    }
}
