package by.epam.ayem.main;

public class StringAsArray1 {

    // 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

    public static void main(String[] args) {

        String[] camelCaseArray = new String[5];

        camelCaseArray[0] = "indexZeroXero";
        camelCaseArray[1] = "indexOne";
        camelCaseArray[2] = "indexTwo";
        camelCaseArray[3] = "indexThree";
        camelCaseArray[4] = "indexFour";

        printArray(camelCaseArray);

        System.out.println("======================");

        String[] snakeCaseArray = convertToSnakeCase(camelCaseArray);

        printArray(snakeCaseArray);

    }

    private static String[] convertToSnakeCase(String[] array) {

        String[] snakeCaseArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {

            snakeCaseArray[i] = array[i].replaceAll("([a-z])([A-Z])", "$1_$2");
            snakeCaseArray[i] = snakeCaseArray[i].toLowerCase();
        }

        return snakeCaseArray;
    }

    private static void printArray(Object[] array) {

        for (Object item : array) {
            System.out.println(item);
        }
    }

}
