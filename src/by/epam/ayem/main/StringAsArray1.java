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

        printArray(camelCaseArray);
        printArray(snakeCaseArray);

    }

    private static String[] convertToSnakeCase(String[] array) {

        String[] snakeCaseArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {

            char[] letters = array[i].toCharArray();
            int count = 0;

            for (char letter : letters) {
                if (letter >= 65 && letter <= 90) {
                    count++;
                }
            }

            char[] replaced = new char[letters.length + count];
            int offset = 0;

            for (int j = 0; j < letters.length; j++) {

                if (letters[j] >= 65 && letters[j] <= 90) {
                    replaced[j + offset] = '_';
                    offset++;
                    replaced[j + offset] = letters[j] += 32;
                } else {
                    replaced[j + offset] = letters[j];
                }
            }
            snakeCaseArray[i] = String.valueOf(replaced);
        }

        return snakeCaseArray;
    }

    private static void printArray(Object[] array) {

        for (Object item : array) {
            System.out.println(item);
        }
    }

//    private static String[] convertToSnakeCase(String[] array) {
//
//        String[] snakeCaseArray = new String[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//
//            snakeCaseArray[i] = array[i].replaceAll("([a-z])([A-Z])", "$1_$2");
//            snakeCaseArray[i] = snakeCaseArray[i].toLowerCase();
//        }
//
//        return snakeCaseArray;
//    }

}
