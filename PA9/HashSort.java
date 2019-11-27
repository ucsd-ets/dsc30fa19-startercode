import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HashSort {

    private int size;
    private int min;
    private int max;

    //TODO - add protected HashTable class here

    public void hashSort(String fileName) {
        File in = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(in);

            //TODO - build HashTable, implement sort

        }
        catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(1);
        }

    }

    public static void main(String[] args) {

    }
}
