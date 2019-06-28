package by.epam.ayem.main;

import java.util.Scanner;

public class StringAsObject3 {

    // 3. Проверить, является ли заданное слово палиндромом.

    private static StringBuilder sb = new StringBuilder();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        enterWord();

    }

    public static void enterWord() {

        System.out.println("Enter a word: ");

        String word = scanner.nextLine();

        isPalindrome(word);
    }

    private static void isPalindrome(String word) {

        StringBuilder getWord = sb.append(word);
        StringBuilder reverse = getWord.reverse();
        String reversedWord = reverse.toString();

        if (reversedWord.compareToIgnoreCase(word) == 0) {
            System.out.println("The word " + word + " is a palindrome");
        } else {
            System.out.println("The word " + word + " is not a palindrome");
        }
    }
}
