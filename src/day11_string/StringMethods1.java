package day11_string;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "CYDEO SCHOOL";
        str = str.toLowerCase(); // cydeo school
        System.out.println(str);

        //--------------------------------------------------------

        String str1 = "java programming";
        str1 = str1.toUpperCase(); // JAVA PROGRAMMING
        System.out.println(str1);

        //--------------------------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase(); // "WOODEN SPOON";
        word = word.toLowerCase(); // "wooden spoon"

        System.out.println(word);

        //--------------------------------------------------------

        String str2 = "             Cydeo School";
        str2 = str2.trim();
        System.out.println(str2);

        //--------------------------------------------------------

        String sentence1 = "Today is Thursday and we have Java Class";

        int index1 = sentence1.indexOf('w');
        System.out.println(index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);

        String s2 = "Java Python Javascript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Python");
        System.out.println(a2);

        int a3 = s2.indexOf("avascript");
        System.out.println(a3);

        int a4 = s2.indexOf("ascript");
        System.out.println(a4);

        // -----------------------------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

        String w1 = "Java Python JavaScript Cydeo Python";

        System.out.println(w1.lastIndexOf('a'));






















    }
}
