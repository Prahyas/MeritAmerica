package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        wordSearch.run();
    }

    public void run() {
        /* Your code goes here */
        System.out.println("What is the fully qualified name of the file that should be searched?");
        String filePath = userInput.nextLine();
        File wordFile = new File(filePath);

        System.out.println("What is the search word you are looking for?");
        String searchTerm = userInput.nextLine();

        System.out.println("Should the search be case sensitive? (Y\\N)");
        boolean caseSensitive = userInput.nextLine().equalsIgnoreCase("Y");

        try (Scanner fileInput = new Scanner(wordFile)) {
            int lineCount = 0;
            while (fileInput.hasNextLine()) {
                lineCount++;
                String lineOfText = fileInput.nextLine();
                if (caseSensitive) {
                    if (lineOfText.contains(searchTerm)) {
                        System.out.println(lineCount + ") " + lineOfText);
                    }
                } else {
                    if (lineOfText.toLowerCase().contains(searchTerm.toLowerCase())) {
                        System.out.println(lineCount + ") " + lineOfText);
                    }
                }

            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("The file doesn't exist");
        }

    }

}
