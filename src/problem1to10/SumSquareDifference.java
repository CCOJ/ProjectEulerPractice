package problem1to10;

/**
 * Sum square difference
 * Problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 */
public class SumSquareDifference {

    private int lo, hi, sumOfSquare, squareOfSum, difference;

    public SumSquareDifference(int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        sumOfSquare = 0;
        squareOfSum = 0;
        computeSumSquareDifference();
    }

    public void computeSumSquareDifference() {

        /**
         * Sum of squares
         */
        for (int i = lo; i <= hi; i++) {
            sumOfSquare += (int) Math.pow(i, 2);
        }

        /**
         * Square of sum
         */
        int sum = 0;
        for (int i = lo; i <= hi; i++) {
            sum += i;
        }
        squareOfSum = (int) Math.pow(sum, 2);

        /**
         * Difference
         */
        difference = Math.abs(sumOfSquare - squareOfSum);
    }

    public int getLo() {
        return lo;
    }

    public int getHi() {
        return hi;
    }

    public int getSumOfSquare() {
        return sumOfSquare;
    }

    public int getSquareOfSum() {
        return squareOfSum;
    }

    public int getDifference() {
        return difference;
    }

    public String toString() {
        return "Difference: " + getDifference()
                +"\nSum of Square: " + getSumOfSquare()
                +"\nSquare of Sum: " + getSquareOfSum()
                +"\nLo: " + getLo()
                +"\nHi: " + getHi();
    }

    public static void main(String[] args) {
        int lo = 1;
        int hi = 100;

        SumSquareDifference problem6 = new SumSquareDifference(lo, hi);
        System.out.println(problem6);
    }
}
