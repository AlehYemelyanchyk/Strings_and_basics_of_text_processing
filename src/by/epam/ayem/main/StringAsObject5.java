package by.epam.ayem.main;

public class StringAsObject5 {

    // 5. Подсчитать, сколько раз среди символов строки встречается буква 'a'.

    public static void main(String[] args) {

        findLetter("That's the largest amount of letters a I can make in a one string");

    }

    private static void findLetter(String str) {

        char a = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (a == (str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Letter '" + a + "' has found " + count + " times in the string");
    }
}
