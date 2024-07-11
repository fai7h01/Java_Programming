package day15_whileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "abcabcabcabcbabcabcbacb";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (result.contains(each + "")){
                continue;
            }
            result += each;
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