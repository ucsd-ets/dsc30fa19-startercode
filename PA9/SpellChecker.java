/**
 * NAME:
 * PID:
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Reads and stores a dictionary from a file, given as command-line argument,
 * in a HashTable, then reads a list of words from another file, given as 
 * command-line argument, and uses the dictionary to determine which words
 * from the list are wrong/misspelled (not contained in the dictionary),
 * providing all possible corrections to the incorrect words (based on the
 * dictionary).
 *
 * @version 1.0
 * @author Thiago Goncalves Marback.
 * @since 2016-03-05
 */
public class SpellChecker implements ISpellChecker {

    private HashTable dictionary;

    /**
     * Reads the dictionary from a Reader input, and stores it in the
     * dictionary HashTable.
     *
     * @param reader The input where the dictionary should be read from.
     */
    @Override
    public void readDictionary( Reader reader ) {
        //TODO
    }
    
    /**
     * Checks the possible corrections for a word that can be made by changing
     * a single character in the String.
     *
     * @param word Word to be corrected.
     * @return List containing all possible corrections made by changing one
     *          character.
     */
    private LinkedList<String> checkWrongLetter( String word ) {
        //TODO
        return null;
    }
    
    /**
     * Checks the possible corrections for a word that can be made by deleting
     * one of the chars of the String.
     *
     * @param word Word to be corrected.
     * @return List containing all possible corrections made by deleting one
     *          character.
     */
    private LinkedList<String> checkDeletedLetter( String word ) {
        //TODO
        return null;
    }
    
    /**
     * Checks the possible corrections for a word that can be made by inserting
     * one character in the String.
     *
     * @param word Word to be corrected.
     * @return List containing all possible corrections made by inserting one
     *          character.
     */
    private LinkedList<String> checkInsertedLetter( String word ) {
        //TODO
        return null;
    }
    
    /**
     * Checks the possible corrections for a word that can be made by
     * transposing two adjacent characters in the String.
     *
     * @param word Word to be corrected.
     * @return List containing all possible corrections made by transposing
     *          two characters.
     */
    private LinkedList<String> checkTransposedLetter( String word ) {
        //TODO
        return null;
    }
    
    /**
     * Checks the possibility of creating two correct words by inserting a 
     * space at some point in the incorrect word.
     * 
     * @param word Word to be corrected.
     * @return List containing all possible corrections made by splitting
     *         into two words.
     */
    private LinkedList<String> checkInsertSpace( String word ) {
        //TODO
        return null;
    }

    /**
     * Checks if a word is correct (exists in the dictionary), and if it
     * isn't, evaluates possible corrections for the word.
     * Possible errors: one wrong letter; one inserted letter; one deleted
     * letter; two transposed adjacent letters.
     * Possible corrections: changing a single character in the word; deleting
     * a letter in the word; inserting a letter in the word; transposing two
     * adjacent letters.
     *
     * @param word Word to be checked.
     * @return null if the word is correct (is in the dictionary). If it is
     *          wrong but no possible corrections were found, returns an
     *          empty array. Else, returns an array with all possible
     *          corrections found.
     */
    @Override
    public String[] checkWord( String word ) {
        //TODO
        return null;
    }

    /**
     * Reads a dictionary from a given text file, storing it into a HashTable.
     * Then, reads a list of words from another given text file, checking if
     * each one is correct (exists in the dictionary). For each word that
     * isn't correct (does not exist in the dictionary), prints the word,
     * followed by all the possible corrections found (if any).
     *
     * @param args Arguments received on startup. Should only contain two:
     * the file where the dictionary is contained, and the file where the 
     * list of words to be checked is contained.
     */
    public static void main( String[] args ) {
        SpellChecker checker = new SpellChecker();
        File dictionary = new File( args[ 0 ] );
        try {
            Reader reader = new FileReader( dictionary );

            //TODO - call readDictionary with the given reader.

        } catch ( FileNotFoundException e ) {
            System.err.println( "Failed to open " + dictionary );
            System.exit( 1 );
        }

        File inputFile = new File( args[ 1 ] );
        try {
            Scanner input = new Scanner( inputFile ); // Reads list of words

            //TODO - go through each word from Scanner

        } catch ( FileNotFoundException e ) {
            System.err.println( "Failed to open " + inputFile );
            System.exit( 1 );
        }
    }

}
