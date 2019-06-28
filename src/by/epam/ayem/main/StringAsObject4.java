package by.epam.ayem.main;

public class StringAsObject4 {

    /*4. С помощью функции копирования и операции конкатенации составить из
    частей слова "информатика" слово "торт".*/

    public static void main(String[] args) {

        String str = "информатика";

        String str2 = str.substring(7, 8);
        String str3 = str.substring(3, 5);
        String str4 = str2 + str3 + str2;

        System.out.println(str4);


    }

}
