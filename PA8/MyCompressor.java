import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyCompressor {

    private static final int NUM_CHAR = 256; // alphabet size of extended ASCII
    private String corpusLocation;
    private HCTree HuffmanTree;

    /**
     * todo: add javadoc
     */
    public static void main(String[] args) throws IOException {

        //todo
        //run compression and decompression here

    }


    /**
     * Constructor of my compressor and decompressor object
     * @param corpusLocation directory to corpus text file
     */
    public MyCompressor(String corpusLocation) throws  IOException {

        //todo

    }

    /**
     * Helper Method
     * Finds count of each ascii character and builds Huffman tree
     * @param corpusLocation directory to corpus text file
     * @return reference to the built HCTree
     */
    private HCTree buildHuffmanTree(String corpusLocation) throws IOException{

        //todo

    }

    /**
     * Compress Method
     * @param inputFile directory of file that is to be compressed.
     * @param compressedFile directory of compressed file.
     */
    public void compress(String inputFile, String compressedFile) throws IOException {
        
        //todo
    }

    /**
     * Decompress Method
     * @param compressedFile directory of compressed file.
     * @param outputFile directory of uncompressed file.
     */
    public void decompress(String compressedFile, String outputFile) throws IOException {

        //todo
    }
}
