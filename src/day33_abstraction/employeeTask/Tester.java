package day33_abstraction.employeeTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName() + " is testing");
    }
}
