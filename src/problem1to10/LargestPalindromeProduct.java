package problem1to10;

/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {

    private int digits, largestProduct, number1, number2;

    /**
     * Accepts number of digits two multiply two numbers together
     * @param digits
     */
    public LargestPalindromeProduct(int digits) {
        this.digits = digits;
        computeLargestProduct();
    }

    /**
     * Computes the largest product
     * @return
     */
    private void computeLargestProduct() {
        int maxNumber1 = (int) Math.pow(10, digits) - 1; //If 3 digits then (10^3)-1 = 1000 - 1 = 999
        int maxNumber2 = (int) Math.pow(10, digits) - 1;
        int number1, number2;
        int product;
        largestProduct = 0;
        int limit = (int) Math.pow(10, digits - 1);

        /**
         * Searches for a palindrome number until it hits the limit (below number of digits) or found palindrome
         */
        for (number1 = maxNumber1; number1 >= limit; number1--) { //Decrements number1
            for (number2 = maxNumber2; number2 >= limit; number2--) { //Decrements number2
                product = number1 * number2;
                if (isPalindrome(product)) {
                    if (product > largestProduct)
                    {
                        largestProduct = product;
                        this.number1 = number1;
                        this.number2 = number2;
                        //System.out.println("---Debug---\nProduct: " + largestProduct + "\n---Debug---\n");
                    }
                }
            }
        }
    }

    /**
     * Checks if it is a palindrome
     */
    private boolean isPalindrome(int value) {
        if (value == 0) {
            return false;
        }
        String palindrome = Integer.toString(value); //Convert int to String
        int left = 0; //Index left of String
        int right; //Index right of String
        char leftChar, rightChar; //Used to compare chars in String

        /**
         *  Decrement right and left index until it reaches the middle of the String
         */
        for (right = palindrome.length() - 1; right >= palindrome.length() / 2; right--) {
            leftChar = palindrome.charAt(left);
            rightChar = palindrome.charAt(right);

            if (leftChar != rightChar) { //If it doesn't match, it returns false
                return false;
            }

            left++;
        }

        return true; //If it passes the check, if returns true
    }

    /**
     * Returns the largestProduct that is a palindrome
     * @return
     */
    public int getLargestProduct() {
        return largestProduct;
    }

    /**
     * Returns first number
     * @return
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Returns second number
     * @return
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Return number of digits used as input
     * @return
     */
    public int getDigits() {
        return digits;
    }

    /**
     * Returns all information for finding the Largest Palindrome Product
     * @return
     */
    public String toString() {
        return "Largest product: " + getLargestProduct()
                +"\nDigits: " + getDigits()
                +"\nNumber 1: " + getNumber1()
                +"\nNumber 2: " + getNumber2();
    }

    public static void main(String[] args) {
        int digits = 3;

        LargestPalindromeProduct problem4 = new LargestPalindromeProduct(digits);

        System.out.println(problem4);
    }
}
