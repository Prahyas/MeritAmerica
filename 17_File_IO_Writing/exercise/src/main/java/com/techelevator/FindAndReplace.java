package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        // Prompt user for input
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourceFile = userInput.nextLine();

        System.out.println("What is the destination file?");
        String destinationFile = userInput.nextLine();

        // Perform find and replace
        boolean operationSuccess = performFindAndReplace(searchWord, replacementWord, sourceFile, destinationFile);

        // Output result
        if (operationSuccess) {
            System.out.println("Replacement completed successfully.");
        } else {
            System.out.println("Error occurred during replacement.");
        }
    }

    private boolean performFindAndReplace(String searchWord, String replacementWord, String sourceFile, String destinationFile) {
        try (Scanner fileScanner = new Scanner(new File(sourceFile));
             PrintWriter writer = new PrintWriter(destinationFile)) {

            // Process each line in the source file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String replacedLine = line.replaceAll("\\b" + searchWord + "\\b", replacementWord);
                writer.println(replacedLine);
            }

            return true; // Operation successful
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return false; // Operation failed
        }
    }
}
