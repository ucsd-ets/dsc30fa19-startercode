/*
 * NAME:
 * PID:
 */

/**
 * Title: HashTable.java
 * Description: File that can create a hash table.
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * A class that implements a hash table and its associated methods
 */
public class HashTable implements IHashTable {
	private LinkedList<String>[] array;//Array that stores linkedlists
	private int numElem;//Number of element stored in the hash table
	private int expand;//Times that the table is expanded
	private int collision;//Times of collisions occurs
	private String statsFileName;
	private boolean printStats = false;
	
	/**
	 * Constructor for hash table
	 */
	@SuppressWarnings("unchecked")
	public HashTable(int size) {
		//TODO
	}
	
	@SuppressWarnings( "unchecked" )
    public HashTable(int size, String fileName){
		//TODO
	}

	/**
	 * Insert the string value into the hash table
	 * @param value value to insert
	 * @return true if the value was inserted, false if the value was already
	 * present
	 */
    @Override
	public boolean insert(String value) {
		//TODO
		return false;
	}

	/**
	 * Delete the given value from the hash table
	 * @param value value to delete
	 * @return true if the value was deleted, false if the value was not found
	 */
	@Override
	public boolean delete(String value) {
		//TODO
		return false;
	}

	/**
	 * Check if the given value is present in the hash table
	 * @param value value to look up
	 * @return true if the value was found, false if the value was not found
	 */
	@Override
	public boolean lookup(String value) {
		//TODO
		return false;
	}

	/**
	 * Print the contents of the hash table to stdout.
	 */
	@Override
	public void printTable() {
		//TODO
	}
	
	@Override
	public int getSize() {
		//TODO
		return -1;
	}


	private int hashString(String value) {
		//TODO
		return -1;
	}
	
	/**
	 * Expands the array and rehashes all values.
	 */
	@SuppressWarnings( "unchecked" )
    private void rehash() {
	    //TODO
	}
	
	/**
	 * Print statistics to the given file.
	 * @return True if successfully printed statistics, false if the file
	 *         could not be opened/created.
	 */
	//@Override
	public boolean printStatistics(){
		//TODO
		return false;
	}
}
