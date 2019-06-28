package by.epam.ayem.main;

public class StringAsObject6 {

//    6. Из заданной строки получить новую, повторив каждый символ дважды.

    public static void main(String[] args) {

        doubleLetters("Make it double");

    }

    private static void doubleLetters(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String letter = "" + str.charAt(i);
            sb.append(letter);
            sb.append(letter);
        }

        System.out.println(sb);
    }
}
