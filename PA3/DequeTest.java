import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Title: class DequeTest
 *  Description: JUnit test class for Deque class
 */
public class DequeTest {

    private Deque empty; // deque with no elements
    private Deque one; // deque with one element
    private Deque many; // deque with several elements
    private Deque full; // full deque

    private int CAP = 10; // capacity of deque
    private int SIZE = 5; // number of elements in deque

    /**
     * Standard Test Fixture. An empty deque, a deque with one element, a deque
     * with several entries, and  a full deque.
     */
    @Before
    public void setUp() {

        empty = new Deque(CAP);
        one = new Deque(CAP);
        // add one element to deque "one"S
        one.addBack(14);
        many = new Deque(CAP);
        //fills "many" deque with SIZE amount of integers
        for (int index = 0; index < SIZE; index++) {
            many.addBack(index);
        }

        full = new Deque(CAP);
        //fills "full" deque with CAP amount of integers
        for (int index2 = 0; index2 < CAP; index2++) {
            full.addBack(index2);
        }
    }

    /** Test if each created deque has the specified capacity */
    @Test
    public void testCapacity() {
        assertEquals("Check capacity=10", CAP, empty.capacity() );
        assertEquals("Check capacity=10", CAP, one.capacity() );
        assertEquals("Check capacity=10", CAP, many.capacity() );
        assertEquals("Check capacity=10", CAP, full.capacity() );
    }

    /** Test if returns the correct size of the Deque for empty, filled, and
     * full deque
     **/
    @Test
    public void testSize() {
        assertEquals("Check size is 0", 0, empty.size() );
        assertEquals("Check size is 1", 1, one.size() );
        assertEquals("Check size is 5", SIZE, many.size() );
        assertEquals("Check size is CAP (10)", CAP, full.size() );
    }

    /** Tests adding an element to the front of the deque for empty, filled,
     * and full deque
     **/
    @Test
    public void testAddFront() {
        assertTrue(empty.addFront(10));
        assertEquals("Size must be 1" , 1, empty.size());
        assertEquals("Element must equal 10", 10, (int)empty.removeFront());

        assertTrue(one.addFront(10));
        assertEquals("Size must be 2", 2, one.size());
        assertEquals("Element must equal 10", 10, (int)one.removeFront());

        assertTrue(many.addFront(10));
        assertEquals("Size must be 6", SIZE + 1, many.size());
        assertEquals("Element must equal 10", 10, (int)many.removeFront());

        assertFalse(full.addFront(10));

    }

    /** Test add front method stops inserting elements when array is full */
    @Test
    public void testAddFrontFull()
    {
        for (int index = 0; index < CAP - SIZE; index++) {
            assertTrue(many.addFront(10));
        }
        assertFalse(many.addFront(1));
    }

    /** Tests if addFront method throws a null exception when specified element is null */
    @Test
    public void testAddFrontNullException() {

        try {
            empty.addFront(null);
            fail("Error: Did not throw exception.");
        }
        catch (NullPointerException e) {
            // Pass
        }

    }

    /** Test add back method */
    @Test
    public void testAddBack() {
        assertTrue(empty.addBack(10));
        assertEquals("Size must be 1" , 1, empty.size());
        assertEquals("Element must equal 10", 10, (int)empty.removeBack());

        assertTrue(one.addBack(10));
        assertEquals("Size must be 2", 2, one.size());
        assertEquals("Element must equal 10", 10, (int)one.removeBack());

        assertTrue(many.addBack(10));
        assertEquals("Size must be 6", SIZE + 1, many.size());
        assertEquals("Element must equal 10", 10, (int)many.removeBack());

        assertFalse(full.addBack(10));

    }

    /** Test add back stops inserting elements when array is full */
    @Test
    public void testAddBackFull()
    {
        for (int index = 0; index < CAP - SIZE; index++) {
            assertTrue(many.addBack(10));
        }
        assertFalse(many.addBack(10));
    }

    /** Tests if addBack method throws a null exception when specified element is null */
    @Test
    public void testAddBackNullException() {

        try {
            empty.addBack(null);
            fail("Error: Did not throw exception.");

        }
        catch(NullPointerException e) {
            // Pass
        }

    }

    /** Testing removing an element from the front in an empty list */
    @Test
    public void testRemoveFrontEmpty() {
        assertEquals("Should be null", null, empty.removeFront() );
    }

    /** Test removing an element from the front */
    @Test
    public void testRemoveFront() {
        assertEquals("Should return element 14", 14, (int)one.removeFront() );
        assertEquals("Should be 0", 0, one.size() );
        assertEquals("Should return element 0", 0, (int)many.removeFront() );
        assertEquals("Should be SIZE-1, or 4", SIZE-1, many.size() );
    }


    /** Testing removing an element from the back in an empty list */
    @Test
    public void testRemoveBackEmpty() {
        assertEquals("Should be null", null, empty.removeBack() );
    }

    /** Test removing an element from the back */
    @Test
    public void testRemoveBack() {
        assertEquals("Should return element 14", 14, (int)one.removeBack() );
        assertEquals("Should be 0", 0, one.size() );
        assertEquals("Should return element 4", 4, (int)many.removeBack() );
        assertEquals("Should be SIZE-1, or 4", SIZE-1, many.size() );
    }

    /** Test retrieving element from front element */
    @Test
    public void testPeekFront() {
        assertEquals("Should be 14", 14, (int)one.peekFront() );
        assertEquals("Should have size 1", 1, one.size() );
        assertEquals("Should be 0", 0, (int)many.peekFront() );
        assertEquals("Should have size SIZE", SIZE, many.size() );
        assertEquals("Should be 0", 0, (int)full.peekFront() );
        assertEquals("Should have size CAP", CAP, full.size() );
    }

    /** Test empty list will return null from a call to peek front */
    @Test
    public void testPeekFrontEmpty() {
        assertEquals("Should be null", null, empty.peekFront() );
    }

    /** Test retrieving element from back element */
    @Test
    public void testPeekBack() {
        assertEquals("Should be 14", 14, (int)one.peekBack() );
        assertEquals("Should have size 1", 1, one.size() );
        assertEquals("Should be 4", 4, (int)many.peekBack() );
        assertEquals("Should have size SIZE", SIZE, many.size() );
        assertEquals("Should be 9", 9, (int)full.peekBack() );
        assertEquals("Should have size CAP", CAP, full.size() );
    }

    /** Test empty list will return null from a call to peek back */
    @Test
    public void testPeekBackEmpty() {
        assertEquals("Should be null", null, empty.peekBack() );
    }

}
