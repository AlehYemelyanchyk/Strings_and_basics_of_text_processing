package by.epam.ayem.main;

public class StringAsObject1 {

    // 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

    public static void main(String[] args) {

        String str = " This       is  the   string   ";

        System.out.println(str);

        countSpaces(str);

    }

    private static void countSpaces(String str) {

        int max = 0;

        String[] strArray = str.split("[\\w]+");

        for (String element : strArray) {
            if (element.length() > max){
                max = element.length();
            }
        }

        System.out.println("Maximum spaces in a row is " + max);
    }

//    private static void countSpaces(char[] chars) {
//
//        int count = 0;
//        int max = 0;
//
//        for (char item : chars) {
//            if (item == ' '){
//                count++;
//            } else {
//                max = count > max ? count : max;
//                count = 0;
//            }
//        }
//
//        System.out.println("Maximum spaces in a row is "+max);
//    }

}
