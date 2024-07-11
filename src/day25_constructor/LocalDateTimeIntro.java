package day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime birthday = LocalDateTime.of(2000,5,10,12,15);

        System.out.println(birthday);

        System.out.println(starts.getDayOfWeek());
        System.out.println(starts.getHour() + " : " + starts.getMinute());

    }
}
