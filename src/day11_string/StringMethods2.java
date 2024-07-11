package day11_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence1 = "I love Python, Python is the best programming language, and Python is in high demand";
        String sentence2 = sentence1.replace("Python", "Java");

        System.out.println(sentence1);
        System.out.println(sentence2);
        //---------------------------------------------------------
        String word = "Java";

        //word = word.replace('a', 'e'); // Jeve

        word = word.replace("a", "e");

        System.out.println(word);

        //---------------------------------------------------------

        String sentence3 = "I love Java, Java is cool";
        //sentence3 = sentence3.replace("Java","Python");
        sentence3 = sentence3.replaceFirst("Java", "Python");

        System.out.println(sentence3);

        //---------------------------------------------------------

        String sentence4 = "Java is fun, Java is cool, Java is amazing";
        //sentence4 = sentence4.replace("Java", "Python");
        sentence4 = sentence4.replaceFirst(", Java", ", Python");
        System.out.println(sentence4);

        //---------------------------------------------------------

        String sentence5 = "I love Java programming";
        System.out.println(sentence5.indexOf('J')); // 7

        String languageName = sentence5.substring(7,10 + 1);
        System.out.println(languageName);

        //---------------------------------------------------------

        String sentence6 = "Today is Sunday, Tomorrow is Monday";
        String weekDay = sentence6.substring(9,15);
        System.out.println(weekDay);

        //---------------------------------------------------------

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);

        //---------------------------------------------------------]

        String sentence7 = "I love Java programming";
        int start = sentence7.indexOf('J');
        sentence7 = sentence7.substring(start);
        System.out.println(sentence7);
        //---------------------------------------------------------

        String sentence8 = "Today is Sunday, tomorrow is Monday";
       /* int index = sentence8.indexOf(" M")+1;
        String tomorrow = sentence8.substring(index);
        System.out.println(tomorrow);
        */
        String tomorrow = sentence8.substring((sentence8.lastIndexOf(' ')+1));
        System.out.println(tomorrow);

        //---------------------------------------------------------

        String sentence9 = "I study at Cydeo School";

        String schoolName = sentence9.substring(11);
        System.out.println(schoolName);

        //---------------------------------------------------------

        String str = "Python";

        String result = (str + "\n").repeat(10);
        System.out.println(result);




















    }
}
