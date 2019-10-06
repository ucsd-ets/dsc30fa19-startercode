/**
 * Name: Justin Lee
 * Date: 10/03/2019
 */

/**
 * Sample method that will demonstrate how JUnit Testing
 * works. Go to the SampleMethodTest.java to see how to
 * write JUnit tests.
 */
public class SampleMethod {
    /**
     * Outputs the second biggest number in given set of numbers.
     *
     * @param a Function will find the second biggest number within
     *          this array.
     * @return The second max or second biggest number in the array.
     */
    public static int secondMax(int[] a) {
        int aLength = a.length;
        if (aLength == 0 || aLength == 1) {
            return Integer.MAX_VALUE;
        }
        int maxOne = Integer.MIN_VALUE;
        int maxTwo = Integer.MIN_VALUE;
        for (int i = 0; i < aLength; i++) {
            if (a[i] > maxOne) {
                maxTwo = maxOne;
                maxOne = a[i];
            } else {
                if (a[i] > maxTwo) {
                    maxTwo = a[i];
                }
            }
        }
        return maxTwo;
    }
}
