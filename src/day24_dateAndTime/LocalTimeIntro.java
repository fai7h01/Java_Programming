package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10,30);

        LocalTime current_time = LocalTime.now();

        System.out.println("starting_time = " + starting_time);
        System.out.println("current_time = " + current_time);

        System.out.println("-------------------------------------------------------");
        
        LocalTime time1 = LocalTime.of(23,59,59);

        System.out.println("time1 = " + time1);

        time1 = time1.plusHours(1);

        System.out.println(time1);

        time1 = time1.plusMinutes(45);

        System.out.println(time1);

        time1 = time1.plusSeconds(1);

        System.out.println(time1);
    }
}
