package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Luka",23,'m', LocalDate.of(2024,5,10));

        System.out.println(person1);


    }
}
