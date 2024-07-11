package day15_whileLoop;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            String suffix = (i == 1)? "st" :(i == 2)? "nd" :(i == 3)? "rd" :(i == 4)? "th" : "th";
            System.out.println("Enter the " + i + suffix + " number:");
            int n1 = input.nextInt();
            if (n1 > max){ // if the user entry is greater than the current maximum number
                max = n1; // then user entered number should be the maximum number
            }
            if (n1 < min){
                min = n1;
            }
        }
        System.out.println("Maximum entered number is " + max);
        System.out.println("Minimum entered number is " + min);

    }


}
/*
Warmup tasks:
	1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number

	2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number

	3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */