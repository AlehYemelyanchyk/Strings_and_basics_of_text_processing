package by.epam.ayem.main;

public class StringAsArray2 {

    // 2. Замените в строке все вхождения 'word' на 'letter'.

    public static void main(String[] args) {

        String newString = "The word-wordowski is mine";

        String modifiedString = newString.replace("word", "letter");

        System.out.println(modifiedString);


    }
}
