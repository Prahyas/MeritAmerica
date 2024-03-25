package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        QuizMaker quizMaker = new QuizMaker();
        quizMaker.run();
    }

    public void run() {
        System.out.println("Enter the fully qualified name of the file to read in for quiz questions: ");
        String filePath = userInput.nextLine();

        File quizFile = new File(filePath);

        try (Scanner fileInput = new Scanner(quizFile)) {
            while (fileInput.hasNextLine()) {
                String lineOfText = fileInput.nextLine();
                String[] questionArray = lineOfText.split("\\|");

                for (int i = 0; i < questionArray.length; i++) {
                    if (questionArray[i].contains("*")) {
                        questionArray[i] = questionArray[i].replace("*", "");
                    }
                    if (i == 0) {
                        System.out.println(questionArray[i]);
                    } else {
                        System.out.println(i + ". " + questionArray[i]);
                    }
                }

                System.out.print("Your answer: ");
                int answer = userInput.nextInt();
                userInput.nextLine(); // Consume the newline character

                int correctAnswerIndex = getCorrectAnswerIndex(questionArray);
                System.out.println(answer);
                System.out.println(correctAnswerIndex);
                if (answer == correctAnswerIndex) {
                    System.out.println("RIGHT!");
                } else {
                    System.out.println("WRONG!");
                }
            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("File does not exist");
        }
    }

    public int getCorrectAnswerIndex(String[] questionArray) {
        int index = 0;
        for (int i = 0; i < questionArray.length; i++) {
            if (questionArray[i].contains("*")) {
                index = i;
            }
        }
        return index;
    }
}