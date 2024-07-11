package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = ""; // only true

        boolean r1 = word.isEmpty();
        System.out.println("r1 = " + r1);

        //---------------------------------------------------

        String word1 = "       "; // true
        boolean r2 = word1.isBlank();
        System.out.println("r2 = " + r2);

        //---------------------------------------------------

        String word2 = "Cydeo";
        String word3 = new String("Cydeo");

        boolean isEqual = word2.equals(word3); // compares value   same characters
        System.out.println(isEqual);

        String str = new String("cydeo");
        System.out.println(word3.equals(str));

        //---------------------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); // false

        System.out.println(s1.equalsIgnoreCase(s2)); // true ===> ignores case sensitivity

        //---------------------------------------------------

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed");
        System.out.println(hasAhmed); // false

        String sentence = "My favourite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println(hasJava); // true

        //---------------------------------------------------

        String name = "Micheal";

        boolean l = name.startsWith("Da");
        System.out.println(l);

        boolean g = name.endsWith("al");
        System.out.println(g);

        String email = "Cydeoschool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);




    }
}
