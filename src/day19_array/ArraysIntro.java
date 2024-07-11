package day19_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 67;
        int score3 = 78;
        int score4 = 94;
        int score5 = 55;

        System.out.println("-----------------------------------");

        int[] scores = new int[5]; // index: 0 - 4
        scores[2] = 86;
        scores[0] = 90;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 98;

        //scores[6] = 65;
        //scores[-5] = 45;

        //scores = new int[10]; // index: 0 - 9

        //scores = new int[50]; // index: 0 - 49

        System.out.println(Arrays.toString(scores));
        System.out.println(scores[2]);

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("------------------------------------------------------");

        System.out.println(scores[scores.length-1]);

    }
}
