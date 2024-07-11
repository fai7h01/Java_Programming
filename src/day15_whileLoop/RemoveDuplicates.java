package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i); // each character from string str
            if (!result.contains("" + each)){ // if string result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
        }

        System.out.println("result = " + result);
    }
}
/*
3. Write a program that can remove the duplicated characters from a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */