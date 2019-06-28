package by.epam.ayem.main;

public class StringAsObject10 {

    /*10. Строка х состоит из нескольких предложений, каждое из которых кончается точкой,
    восклицательным или вопросительным знаком. Определить количество предложений в строке X.*/

    public static void main(String[] args) {

        String x = "Hello there! It's been a long time. How are you doing? I'm ok, too.";

        String[] strArray = x.split("[!?.]");

        System.out.println("String x has " + strArray.length + " sentences.");

    }
}
