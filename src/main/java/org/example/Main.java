package org.example;


import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("Test"));
        System.out.println(checkForPalindrome("Welcome"));
        System.out.println("****************");
        */
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }

    public static boolean checkForPalindrome(String input) {
        String specialsRemoved = removeSpecialCharacters(input);
        System.out.println(specialsRemoved);
        String lowered = specialsRemoved.toLowerCase(Locale.ENGLISH);
        System.out.println(lowered);
        String spacesRemoved = removeSpaces(lowered);
        System.out.println(spacesRemoved);
        String reversed = reverseString(spacesRemoved);
        System.out.println(reversed);


        return spacesRemoved.trim().equals(reversed.trim());
    }

    public static String removeSpecialCharacters(String input) {
        return input.replaceAll("[^a-zA-Z0-9\\s]", "");
    }

    public static String removeSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static String convertDecimalToBinary(int input) {
        if (input == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();

        while (input > 0) {
            int remainder = input % 2;
            binaryString.append(remainder);
            input /= 2;
        }

        return binaryString.reverse().toString();
    }
}