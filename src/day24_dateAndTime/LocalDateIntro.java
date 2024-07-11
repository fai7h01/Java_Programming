package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(2000,5,10);

        System.out.println("birthday -> " + birthday);

        System.out.println("-------------------------------------------------------");

        System.out.println(today.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println(birthday.getDayOfWeek());

        System.out.println("-------------------------------------------------------");

        today = today.plusYears(1); // 2023-06-16

        System.out.println(today);

        System.out.println("-------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate = graduationDate.plusYears(2); // 2027-6-4

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("-------------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(2000,5,10);

        LocalDate yourBrother = yourBirthday.minusMonths(3).minusYears(2);

        LocalDate yourSister = yourBirthday.plusYears(3).minusMonths(4).plusDays(4);

        System.out.println("yourBirthday = " + yourBirthday);
        System.out.println("yourBrother = " + yourBrother);
        System.out.println("yourSister = " + yourSister);

        System.out.println("-------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        boolean isEqual = birthday1.isEqual(birthday2);
        System.out.println("isEqual = " + isEqual);

        System.out.println("-------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isAfter(LocalDate.now()));
        System.out.println(grad_date.isBefore(LocalDate.of(2023,12,13)));

        System.out.println("-------------------------------------------------------");

        System.out.println(LocalDate.of(2024,1,1).isLeapYear());











    }
}
