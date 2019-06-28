package by.epam.ayem.main;

public class StringAsArray3 {

    // 3. В строке найти количество цифр.

    public static void main(String[] args) {

        countDigits("This is3 the te4st90 str34ng");

    }

    private static void countDigits(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                count++;
            }
        }

        System.out.println(str + "\nhas " + count + " digits");

    }
}
