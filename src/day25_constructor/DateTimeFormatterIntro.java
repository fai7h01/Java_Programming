package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y, EEEE");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        System.out.println("-----------------------------------------");

        LocalDate grad_date = LocalDate.of(2024,8,7);

        System.out.println(grad_date.format(df));

        System.out.println("-----------------------------------------");

        LocalTime starts = LocalTime.of(14,15);
        System.out.println(starts.format(tf));

        System.out.println(grad_date.format(df));

        System.out.println("-----------------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/y");

        LocalDateTime ends = LocalDateTime.now();

        System.out.println(ends.format(dtf));

        System.out.println("-----------------------------------------");


        LocalDateTime task = LocalDateTime.of(2020,11,24,13,00);
        System.out.println(task.format(dtf));

    }
}
