package com.lesedibale.maven;

import java.util.Scanner;

/* Develop a text-based hangman game where players guess letters to uncover a hidden word. Include features like displaying the current progress, tracking incorrect guesses, and limiting the number of attempts. */

// game chooses a random word
// hide the word with dashes
// get user input (letter/full word) 
// check if input == 1 char / length of the word
// if none are provided, prompt the user again
// if user provided the word -> check if they won
// if user provided a letter 
// check if the word contains the given letter

public class Hangman {
    public String getValue() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Letter: ");
        String value = scn.nextLine();

        scn.close();

        return value;
    }

    public String hideWord(String word) {
        if (word.contains("-")) {
            throw new RuntimeException("invalid word");
        }

        return "_".repeat(word.length());
    }
}
