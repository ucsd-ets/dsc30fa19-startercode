import java.util.ArrayList;

/**
 * Deque Class.
 * A class of a deque implemented using a "circular" array.
 * @author Don Vo
 * @Version 1.0
 */
public class Deque {

    private ArrayList list; // Stores the elements
    private int head; // Store the index of first & last elements respectively
    private int tail;
    private int size;

    /**
     * Default Deque constructor.
     * Creates a Deque Object
     * @throws IllegalArgumentException
     */
    public Deque() throws IllegalArgumentException {

    }

    /**
     * Deque constructor.
     * Creates a Deque Object
     * @param cap - capacity of list
     * @throws IllegalArgumentException - if capacity is negative.
     */
    public Deque(int cap) throws IllegalArgumentException {
        
    }

    /**
     * Capacity method.
     * Returns the capacity of the Deque, that is,
     * the maximum number of objects it can hold.
     * @return the capacity of the list
     */
    public int capacity() {

    }

    /**
     * Size method.
     * Returns the number of elements in the Deque.
     * @return the number of elements in the list
     */
    public int size() {

    }

    /**
     * Is empty method.
     * Returns if the Deque is empty.
     * @return if the Deque is empty.
     */
    public boolean isEmpty() {

    }

    /**
     * Is full method.
     * Returns if the Deque is full.
     * @return if the Deque is full.
     */
    public boolean isFull() {

    }

    /**
     * Add Front Method.
     * Adds the specified element to the front the Deque.
     * @param i - the element to add to the front of the list
     * @return true if adding was successful, false if not
     * @throws NullPointerException if the specified element is null
     * and size is less than capacity
     */
    public boolean addFront(Integer i) throws NullPointerException {
        
    }

    /**
     * Add Back Method.
     * Adds the specified element to the back of Deque.
     * Returns true if successful. False if not.
     * @param i - the new element to add to the back of the list
     * @return true if adding was successful, false if not
     * @throws NullPointerException if the specified element is null
     * and size is less than capacity
     */
    public boolean addBack(Integer i) throws NullPointerException {

    }

    /**
     * Remove Front Method.
     * Removes the element at the front of Deque.
     * Returns the element removed or returns null if there is no element.
     * @return  the element removed, or null if the size was zero.
     */
    public Integer removeFront() {

    }

    /**
     * Remove Back Method.
     * Removes the element at the back of Deque.
     * Returns the element removed or returns null if there is no element.
     * @return  the element removed, or null if the size was zero.
     */
    public Integer removeBack() {

    }

    /**
     * Peek Front Method.
     * Returns the element at the front of the Deque
     * or null if such element does not exist.
     * @return the element at the front or null if the size was zero.
     */
    public Integer peekFront() {

    }

    /**
     * Peek Back Method.
     * Returns the element at the back of the Deque
     * or null if such element does not exist.
     * @return the element at the back or null if the size was zero.
     */
    public Integer peekBack() {
        
    }
}
