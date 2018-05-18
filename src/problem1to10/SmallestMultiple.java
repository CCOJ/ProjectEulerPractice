package problem1to10;

/**
 * Smallest multiple
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

    private int lo, hi, multiple;

    public SmallestMultiple(int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        computeMultiple();
    }

    private void computeMultiple() {
        boolean divisible = false;

        /**
         * Increments multiple until it is divisible by the range [lo, hi].
         * If divisible stays true from the inner loop, the outer loop exits.
         */
        for (multiple = 1; divisible == false;) {
            divisible = true; //Assume it is divisible until set false by inner loop

            /**
             * Iterates multiple to be divided by divisor.
             * If divisible is false, it exits this loop.
             */
            for (int divisor = lo; divisible == true && divisor <= hi; divisor++) {
                if (multiple % divisor != 0) { //Sets false if there is a remainder
                    divisible = false;
                    multiple++; //If it fails, it tries the next multiple
                }
            }
        }
    }

    public int getMultiple() {
        return multiple;
    }

    public int getLo() {
        return lo;
    }

    public int getHi() {
        return hi;
    }

    public String toString() {
        return "Smallest Multiple: " + getMultiple()
                + "\nLo: " + getLo()
                + "\nHi: " + getHi();
    }

    public static void main(String[] args) {
        int lo = 1;
        int hi = 20;
        SmallestMultiple problem5 = new SmallestMultiple(lo, hi);

        System.out.println(problem5);
    }
}
