package by.epam.ayem.main;

public class StringAsObject1 {

    // 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

    public static void main(String[] args) {

        String str = " This_    -is7   -the   string   ";

        System.out.println(str);

        countSpaces(str);

    }

    private static void countSpaces(String str) {

        int max = 0;

        String[] strArray = str.split("[\\S]+");

        for (String element : strArray) {
            if (element.length() > max) {
                max = element.length();
            }
        }

        System.out.println("Maximum spaces in a row is " + max);
    }
}
