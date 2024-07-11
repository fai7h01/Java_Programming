package day14_forLoop;

public class WarmUpTasks {
    public static void main(String[] args) {

        String str3 = combine("java", "apple");
        System.out.println(str3);
        char ch = 'S';
        String s1 = ch + "";
        String s2 = s1.charAt(0) + "";
        System.out.println("----------------------------------------------");

        System.out.println(sumOf2IntegerNumbers(10, 20));

        System.out.println(sumOf3Numbers(10, 20, 30));

        System.out.println(sumOf4Numbers(10, 20, 30, 40));

    }

    public static String combine(String word1, String word2) {
        String result;
        if (word1.endsWith("" + word2.charAt(0))) { // concated to empty string to get a string
            result = word1 + word2.substring(1);
        } else {
            result = word1 + word2;
        }
        /*if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            result = word1 + word2.substring(1);
        }else{
            result = word1 + word2;
        }
         */
        return result;
    }

    public static int sumOf2IntegerNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static int sumOf3Numbers(int n1, int n2, int n3) {
        // return n1 + n2 + n3;
        return sumOf2IntegerNumbers(n1, n2) + n3;
    }

    public static int sumOf4Numbers(int n1, int n2, int n3, int n4) {
        // return n1 + n2 + n3 + n4;
        // return sumOf3Numbers(n1,n2,n3) + n4;
        // return sumOf2IntegerNumbers(n1,n2) + sumOf2IntegerNumbers(n3,n4);
        // return sumOf2IntegerNumbers(sumOf3Numbers(n1,n2,n3), n4);
        return sumOf3Numbers(sumOf2IntegerNumbers(n1, n2), n3, n4);
    }


}
/*
Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers


 */