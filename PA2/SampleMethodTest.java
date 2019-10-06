import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Demonstrates how JUnit Testing works. Right click on SampleMethodTest
 *  in the navigation bar, then click on run Run 'SampleMethodTest' to
 *  run the JUnit tests.
 */
public class SampleMethodTest {

    /* Declare some variables here that might be used for multiple
     * tests. This will save you from having to declare the variable
     * over and over.
     */
    int[] blankArr;
    int[] oneArr;

    /* @Before tag means that the method will run before all the @Test tags.
     * Usually, in the @Before tag, you will want to initalize the variables
     * you will be using in multiple tests. This will save you the trouble of
     * initializing the same variables over and over.
     */
    @Before
    public void testsetUp() throws Exception {
        blankArr = new int[0];
        oneArr = new int[1];
        oneArr[0] = 1;
    }

    /* In the method after @Test tag is where you will put your tests. For
     * each method after @Test, you will put in assert statements
     */
    @Test
    public void testUsualCaseSecondMax() {
        int[] testThree = {1, 1, 2, 1, 3, 4, 2, 2, 2, 3, 2, 1, 1, 1};

        /* assertEquals will be your most often used method when JUnit
         * testing. In assertEquals, you are checking if your expected
         * result matches up with your actual result. To do that, one
         * of your arguments for your assertEquals will be your expected
         * result and the other argument will be actual value of something
         * you implemented.
         */

        assertEquals(3, SampleMethod.secondMax(testThree));

        /* Uncomment the code below and see what occurs when expected
         * and actual result do not match
         */

        // assertEquals(4, SampleMethod.secondMax(testThree));
    }

    /* Notice you can have more than one test for a method. You can
     * break up JUnit testing into multiple methods for the same method.
     */
    @Test
    public void testedgeCaseSecondMax() {
        // Testing for some edge cases.
        assertEquals(Integer.MAX_VALUE, SampleMethod.secondMax(blankArr));
        assertEquals(Integer.MAX_VALUE, SampleMethod.secondMax(oneArr));
    }
}