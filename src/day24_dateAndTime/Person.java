package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
public class Person {

    String name;
    int age;
    char gender;
    LocalDate birthday;

    public void setInfo(String name, char gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        age = LocalDate.now().getYear() - birthday.getYear();
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age+
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
