package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "James";
        myGroup[1] = "Luka";
        myGroup[myGroup.length-1] = "Layla";
        myGroup[2] = "Sumeye";
        myGroup[3] = "Nash";

        System.out.println(Arrays.toString(myGroup));

        myGroup[2] = "Tatuli";
        //myGroup[5] = "Muhtar";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------------------");

        for (int i = myGroup.length-1;  i >= 0 ; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("---------------------------------");

        //myGroup.fori ===> shortcut
        //my.Group.forr ===> reverse


    }
}
