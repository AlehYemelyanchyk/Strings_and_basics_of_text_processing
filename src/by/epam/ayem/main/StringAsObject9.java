package by.epam.ayem.main;

public class StringAsObject9 {

    /*9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    Учитывать только английские буквы.*/

    public static void main(String[] args) {

        countLetters("aabWE_12");

    }

    private static void countLetters(String str) {

        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {

            boolean engLetters = (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
                    (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z');

            if (engLetters && Character.isLowerCase(str.charAt(i))) {
                lowerCaseCount++;
            } else if (engLetters && Character.isUpperCase(str.charAt(i))) {
                upperCaseCount++;
            }
        }

        System.out.println("UpperCase: " + upperCaseCount);
        System.out.println("LowerCase: " + lowerCaseCount);
    }
}
