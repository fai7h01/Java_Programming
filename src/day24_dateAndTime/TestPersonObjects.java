package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Luka", 'M', LocalDate.of(1963, 5, 10));
        people[1].setInfo("Tatuli", 'F', LocalDate.of(2003, 1, 14));
        people[2].setInfo("Sesili", 'F', LocalDate.of(1954, 3, 8));
        people[3].setInfo("Khatuna", 'F', LocalDate.of(1974, 12, 31));
        people[4].setInfo("Dato", 'M', LocalDate.of(1974, 11, 7));

        ArrayList<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(people));

        for (Person each : list) {
            System.out.println(each.name + " : " + each.birthday);
        }

        System.out.println("------------------------------------------------------");

        list.removeIf(p -> p.age > 55);

        for (Person each : list) {
            System.out.println(each.name + " : " + each.age);
        }

    }
}
