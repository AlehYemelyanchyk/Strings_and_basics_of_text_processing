package by.epam.ayem.main;

public class StringAsObject8 {

    /*8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/

    public static void main(String[] args) {

        findLongestWord("bath relocation static powerful");

    }

    private static void findLongestWord(String str) {

        String[] wordsArray = str.split(" ");

        int longestWordLength = 0;
        String longestWord = "";

        for (String word : wordsArray) {
            if (word.length() > longestWordLength) {
                longestWord = word;
                longestWordLength = word.length();
            }
        }

        System.out.println("The longest word in the string is '" + longestWord + "'");
    }
}
