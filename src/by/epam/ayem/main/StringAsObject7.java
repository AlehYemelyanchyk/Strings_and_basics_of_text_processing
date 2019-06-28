package by.epam.ayem.main;

public class StringAsObject7 {

    /*7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
        Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/

    public static void main(String[] args) {

        String str = "abc cde def";
        String str2 = str.replaceAll("\\s", "");

        deleteCopy(str2);


    }

    private static void deleteCopy(String str) {

        String newString = "";
        char[] chars = str.toCharArray();

        for (char item : chars) {
            String letter = "" + item;
            if (!newString.contains(letter)){
                newString += letter;
            }
        }

        System.out.println(newString);
    }


}
