package by.epam.ayem.main;

public class StringAsArray4 {

    // 4. Найти в строке количество чисел.

    public static void main(String[] args) {

        String string = "33This is3 the te4st0 stri34ng";

        String newString = string.replaceAll("[^0-9]+", " ");
        String numberOnly = newString.trim();

        String[] numbers = numberOnly.split(" ");

        System.out.println(string + "\nhas " + numbers.length + " numbers");
    }
}
