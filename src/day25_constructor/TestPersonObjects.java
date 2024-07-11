package day25_constructor;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person("Luka",23,'M', LocalDate.of(2000,5,10),false,true);

        p1.eating("Khinkali");
        p1.drinking("Water");
        p1.sleeping();

        System.out.println("----------------------------------------------------------------------");

        Person p2 = new Person("Sarah",25,'F',LocalDate.of(1998,03,25),true,true);

        p2.eating("Spaghetti");
        p2.drinking("Juice");
        p2.sleeping();

        System.out.println(p1);
        System.out.println(p2);


    }
}
