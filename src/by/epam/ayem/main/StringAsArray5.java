package by.epam.ayem.main;

public class StringAsArray5 {

    /*5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
    заменить на одиночные пробелы. Крайние пробелы в строке удалить.*/

    public static void main(String[] args) {

        String string = " This    is   the   string   ";

        System.out.println(string);

        String string2 = string.replaceAll("\\s+", " ");
        String string3 = string2.trim();

        System.out.println(string3);

    }

}
