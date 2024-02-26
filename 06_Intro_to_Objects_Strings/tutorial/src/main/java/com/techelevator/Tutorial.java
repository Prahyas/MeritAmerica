package com.techelevator;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {

        // *********** Step 1: Use the *new* operator to create Strings on the Heap
        // *************
        // Create a new string from an array of characters
        char[] helloChars = new char[] { 'h', 'e', 'l', 'l', 'o', '!' };
        String greeting = new String(helloChars);
        System.out.println("Greeting: " + greeting);

        String salutation = new String("Welcome my friend");
        System.out.println("Salutation: " + salutation);

        String toast = "May the compiler rise up to meet you.";
        System.out.println("Toast: " + toast);
        // *********** Step 2: Try out some String methods *************

        // Prompt the user to enter a sentence
        System.out.print("Please type a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        String uppercaseSentence = sentence.toUpperCase();
        System.out.println(uppercaseSentence);

        // Print the sentence in all lower-case
        System.out.println(sentence.toLowerCase());

        int firstSpace = sentence.indexOf(" ");
        // Report the length of the first word
        if (firstSpace == -1) {
            // IndexOf returns -1 when the string is not found.
            // If there is no space, assume the whole sentence is one word.
            System.out.println("The first word is " + sentence.length() + " characters long.");
        } else {
            // Report the length of the first word
            System.out.println("The first word is " + firstSpace + " characters long.");
        }

        // Replace the word "the" with "the one and only"
        System.out.println(sentence.replace("the", "the one and only"));

        // list the words (split)
        String[] words = sentence.split(" ");
        System.out.println("The words in this sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Re-assemble the sentence with a new delimiter
        String dashSentence = String.join("-->", words);
        System.out.println(dashSentence);

        // Print the initial sentence. Notice it has not changed.
        System.out.println(sentence);

        // *********** Step 3: Compare Strings *************

        // *********** Step 3: Compare Strings *************
        String secretWord = "Secret!";
        System.out.print("Enter the secret word (hint: it's '" + secretWord + "') ");
        String userSecretWord = scanner.nextLine();

        // Compare using ==
        boolean matchEqualityOperator = secretWord == userSecretWord;
        System.out.println("Using '==': " + matchEqualityOperator);

        // Compare using equals()
        boolean matchEquals = secretWord.equals(userSecretWord);
        System.out.println("Using '.equals(): " + matchEquals);

        // Compare using equalsIgnoreCase()
        boolean matchEqualsIgnoreCase = secretWord.equalsIgnoreCase(userSecretWord);
        System.out.println("Using '.equalsIgnoreCase(): " + matchEqualsIgnoreCase);
    }
}
