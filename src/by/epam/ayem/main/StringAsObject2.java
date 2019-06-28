package by.epam.ayem.main;

public class StringAsObject2 {

//    2. В строке вставить после каждого символа 'a' символ 'b'.

    public static void main(String[] args) {

        String str = "All letters here has a letter b after them";

        String str2 = str.replaceAll("a","ab");
        String str3 = str2.replaceAll("A","Ab");

        System.out.println(str3);

    }

}
