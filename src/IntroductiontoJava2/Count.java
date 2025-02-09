package IntroductiontoJava2;
import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Count {
    public static void main(String args []){

        if (args.length < 2) {
            System.out.println("Usage: java WordCountInFile <filename> <word>");
            return;
        }

        String fileName = args[0]; // First argument: file name
        String wordToFind = args[1]; // Second argument: word to search
        int count = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {  // Read words one by one
                String word = fileScanner.next();
                if (word.equals(wordToFind)) {
                    count++;
                }
            }
            System.out.println("The word '" + wordToFind + "' appears " + count + " times in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }



    }
}