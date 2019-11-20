
import java.io.*;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * The Huffman Coding Tree
 */
public class HCTree {

    private static final int NUM_CHARS = 256; // alphabet size of extended ASCII
    private static final int BYTE_BITS = 8; // number of bits in a byte

    private HCNode root; // the root of HCTree
    private HCNode [] leaves = new HCNode[NUM_CHARS]; // the leaves of HCTree that contain all the symbols

    /**
     * The Huffman Coding Node
     */
    protected class HCNode implements Comparable<HCNode> {

        byte symbol; // the symbol contained in this HCNode
        int freq; // the frequency of this symbol
        HCNode c0, c1, parent; // c0 is the '0' child, c1 is the '1' child
        
        /**
         * Initialize a HCNode with given parameters
         * @param symbol the symbol contained in this HCNode
         * @param freq the frequency of this symbol
         */
        HCNode(byte symbol, int freq) {
            
            //todo
        }

        /**
         * Getter for symbol
         * @return the symbol contained in this HCNode
         */
        byte getSymbol() {
            
            //todo
        }

        /**
         * Setter for symbol
         * @param symbol the given symbol
         */
        void setSymbol(byte symbol) {
            
            //todo
        }

        /**
         * Getter for freq
         * @return the frequency of this symbol
         */
        int getFreq() {
            
            //todo
            return 0;
        }

        /**
         * Setter for freq
         * @param freq the given frequency
         */
        void setFreq(int freq) {
            
            //todo
        }

        /**
         * Getter for '0' child of this HCNode
         * @return '0' child of this HCNode
         */
        HCNode getC0() {
            
            //todo
        }

        /**
         * Setter for '0' child of this HCNode
         * @param c0 the given '0' child HCNode
         */
        void setC0(HCNode c0) {
            
            //todo
        }

        /**
         * Getter for '1' child of this HCNode
         * @return '1' child of this HCNode
         */
        HCNode getC1() {
            
            //todo
        }

        /**
         * Setter for '1' child of this HCNode
         * @param c1 the given '1' child HCNode
         */
        void setC1(HCNode c1) {
            
            //todo
        }

        /**
         * Getter for parent of this HCNode
         * @return parent of this HCNode
         */
        HCNode getParent() {
            
            //todo
        }

        /**
         * Setter for parent of this HCNode
         * @param parent the given parent HCNode
         */
        void setParent(HCNode parent) {
            
            //todo
        }

        /**
         * Check if the HCNode is leaf
         * @return if it's leaf, return 1. Otherwise, return 0.
         */
        boolean isLeaf() {

            //todo

        }
        /**
         * Defines how object is printed in console
         */
        public String toString() {
            return "Symbol: " + this.symbol + "; Freq: " + this.freq;
        }

        /**
         * compareTo method
         */
        public int compareTo(HCNode o) {
        }
    }


    /**
     * todo: add javadoc
    */
    public HCNode getRoot() {
        
        //todo

    }

    /**
     * todo: add javadoc
    */
    public void setRoot(HCNode root) {
        
        //todo

    }

    /**
     * todo: add javadoc
    */
    public void buildTree(int[] freq) {

        //todo

    }

    /**
     * todo: add javadoc
    */
    public void encode(byte symbol, BitOutputStream out) throws IOException{

        //todo

    }

    /**
     * todo: add javadoc
    */
    public byte decode(BitInputStream in) throws IOException{

        //todo

    }

}
