/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex03;

import java.util.Scanner;

public class printingQuotes {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for the quote and who said it
        System.out.print("What is the quote? ");
        String inputQuote = in.nextLine();
        System.out.print("Who said it? ");
        String inputSpeaker = in.nextLine();

        // Output within a single line using escape characters
        System.out.print( inputSpeaker+ " Says, "+ "\"" + inputQuote + "\"" );

    }
}
