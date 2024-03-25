package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FizzWriter fizzWriter = new FizzWriter();
        fizzWriter.run();
    }

    public void run() {
        System.out.println("What is the destination file?");
        String destinationFile = userInput.nextLine();

        generateFizzBuzzToFile(destinationFile);
        System.out.println("FizzBuzz numbers generated and written to " + destinationFile);
    }

    private void generateFizzBuzzToFile(String destinationFile) {
        try (PrintWriter writer = new PrintWriter(destinationFile)) {
            for (int i = 1; i <= 300; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    writer.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    writer.println("Fizz");
                } else if (i % 5 == 0) {
                    writer.println("Buzz");
                } else {
                    writer.println(i);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
