package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student extends Person{
    private char grade;
    private final String schoolName;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String schoolName) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

}
